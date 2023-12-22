import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = n / (a + b);
        long s = c * a;
        long d = n % (a + b);
        if(d > a){
            s = s + a;
        }else{
            s = s + d;
        }
        System.out.println(s);
        sc.close();
    }
}