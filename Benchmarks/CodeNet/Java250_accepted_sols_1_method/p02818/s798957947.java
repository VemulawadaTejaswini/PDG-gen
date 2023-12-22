import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        long a=in.nextLong();
        long b=in.nextLong();
        long k=in.nextLong();
        if(a<=k) {
            k-=a;
            a=0;
        }
        else {
            a-=k;
            k=0;
        }
        if(b<=k) {
            b=0;
        }
        else b-=k;
        System.out.println(a+" "+b);
    }
}