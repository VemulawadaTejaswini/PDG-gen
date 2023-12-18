import java.util.Scanner;

public class Main {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = 0;
        if(c<b){
            d=c; c=b; b=d;
        }
        if(b<a){
            d=b; b=a; a=d;
        }
        if(c<b){
            d=c; c=b; b=d;
        }
        System.out.println(a+" "+b+" "+c);
        sc.close();
    }
}
