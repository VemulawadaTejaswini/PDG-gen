import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int t = 0;

        if(a>b){
             t=a;    a=b;    b=t;
        }
        if(b>c){
             t=b;    b=c;    c=t;
        }
        if(a>b){
             t=a;    a=b;    b=t;
        }
        System.out.println(a+" "+b+" "+c);
        sc.close();
    }
}
