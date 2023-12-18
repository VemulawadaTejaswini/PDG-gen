

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());
        Pair[] pairs=new Pair[n];
        for(int i=0;i<n;i++){
            String[] s=br.readLine().split(" ");
            int x=Integer.parseInt(s[0].trim());
            int y=Integer.parseInt(s[1].trim());
            pairs[i]=new Pair(x,y);
        }
        int res=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int r=Math.abs(pairs[i].x-pairs[j].x)+Math.abs(pairs[i].y-pairs[j].y);
                res=Math.max(r,res);
            }
        }
        System.out.println(res);







    }


}
class Pair{
    int x,y;
    Pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
