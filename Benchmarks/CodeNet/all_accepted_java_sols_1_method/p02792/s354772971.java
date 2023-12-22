import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int N=Integer.parseInt(br.readLine());
        int[][] c=new int[10][10];
        int sum=0; int mid=0;
        for(int p=1;p<10;p++){
            for(int s=1;s<10;s++){
                for(int i=0;i<=N;i++){
                    String str=i+"";
                    if(str.substring(0,1).equals(p+"") 
                            && str.substring(str.length()-1,str.length()).equals(s+"")){
                        c[p][s]++;
                    }
                }
                
            }
        }
        for(int p=1;p<10;p++){
            for (int i = 1; i < 10; i++) {
                sum+=c[p][i]*c[i][p];
            }
        }
        System.out.println(sum);
    }
    
}