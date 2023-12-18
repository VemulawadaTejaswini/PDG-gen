import static java.lang.Math.*;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int N=in.nextInt();
        int Y=in.nextInt();
        // boolean flag=false;
        out:for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                if(Y==10000*i+5000*j+1000*(N-i-j)){
                    // flag=true;
                    System.out.println(i+" "+j+" "+(N-i-j));
                    return;
                    // break out;
                }
            }
        }
        System.out.println("-1 -1 -1");
        
    }
}