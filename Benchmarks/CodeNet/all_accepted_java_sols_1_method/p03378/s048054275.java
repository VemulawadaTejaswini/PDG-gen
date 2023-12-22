import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int X=sc.nextInt();
        int lc=0,rc=0;
        for(int i=1;i<=M;i++){
            if(sc.nextInt()<X){
                lc++;
            }else{
                rc++;
            }
        }
        System.out.println(Math.min(lc,rc));
    }
}

