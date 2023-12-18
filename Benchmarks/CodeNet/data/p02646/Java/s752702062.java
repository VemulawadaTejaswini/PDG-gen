import java.util.*;

public class Main {

    static int gcd (int a, int b) {return b>0?gcd(b,a%b):a;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long V = sc.nextLong();
        long B = sc.nextLong();
        long W = sc.nextLong();
        long T = sc.nextLong();


        if(A == B){
            System.out.println("YES");
            System.exit(0);
        }

        if(W >= V){
            System.out.println("NO");
            System.exit(0);
        }

        long diff = Math.abs(A-B);
        long diffSpeed = Math.abs(W-V);

        if(diff % diffSpeed !=0){
            System.out.println("NO");
            System.exit(0);
        } else {
            if(diff / diffSpeed > T){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }


    }

}
