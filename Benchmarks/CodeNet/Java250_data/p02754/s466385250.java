import java.util.Scanner;

public class Main{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long a = sc.nextLong();
        long b = sc.nextLong();

        if(a+b==0){
            System.out.println(0);
            return;
        }

        long rem = n % (a+b);
        n -= rem;
        System.out.println(n/(a+b)*a + Math.min(rem,a));
    }
}
