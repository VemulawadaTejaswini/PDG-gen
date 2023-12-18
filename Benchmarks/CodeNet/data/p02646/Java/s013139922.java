import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int v=in.nextInt();
        int b=in.nextInt();
        int w=in.nextInt();
        int t=in.nextInt();
        if(v>w){
            v=v*t;
            w=w*t;
            if(v>=w){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            if(a==b){
                System.out.println("YES");
            }else{
            System.out.println("NO");
            }
        }
    }
}