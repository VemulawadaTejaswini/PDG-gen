import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt(),b=sc.nextInt(),ab=sc.nextInt(),x=sc.nextInt(),y=sc.nextInt();
        if(ab*2>a+b){
          System.out.println(a*x+b*y);
        }else if(x>y&&ab*2<a){
          System.out.println(ab*2*x);
        }else if(x<y&&ab*2<b){
          System.out.println(ab*2*y);
        }else if(x>y){
          System.out.println(ab*2*y+a*(x-y));
        }else if(x<y){
          System.out.println(ab*2*x+b*(y-x));
        }else{
          System.out.println(ab*2*x);
        }


    }
}