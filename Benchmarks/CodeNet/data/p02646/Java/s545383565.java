import java.util.Scanner;
import java.util.Random;

public class Main{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int v=sc.nextInt();
        int b=sc.nextInt();
        int w=sc.nextInt();
        int t=sc.nextInt();
        int x=0,y=0,z=0,c=0;
        x=v*t+a;
        y=a-v*t;
        z=w*t+b;
        c=b-w*t;
        if(x<=1000000000 || y>=-1000000000){
            if(z<=1000000000 || c>=-1000000000){
            if(b>a && x>=z){
                System.out.println("YES");
            }else if(b<a && y<=c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        }
    }
}