import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a, b, x;
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>=3 && b<=20){
            if(a>b){
               int c = a-1;
               if(c>b){
                   System.out.println(a+c);
               }
               else{
                   System.out.println(a+b);
               }
            }
            else{
                int c = b-1;
                if(c>a){
                    System.out.println(b+c);
                }
                else{
                    System.out.println(a+b);
                }
            }
        }
    }
}