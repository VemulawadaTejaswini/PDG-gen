import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        //n は 3 以上 100　以下とします。
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            String line = br.readLine();
            String[] line2 = line.split(" ");
            int i1=Integer.parseInt(line2[0]);
            int i2=Integer.parseInt(line2[1]);
            if(i1==0 && i2==0)break;
            System.out.println(combination(Integer.parseInt(line2[0]),Integer.parseInt(line2[1]) ) );
        }
    }
    static int combination(int a,int b) {
        int count=0;
        for(int i=a;i>=1;i--)
            for(int j=i-1;j>=1;j--)
                for(int k=j-1;k>=1;k--) 
                    if(i+j+k==b)count++;
        return count;
    }
}