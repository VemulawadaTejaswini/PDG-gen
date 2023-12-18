import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        double B = sc.nextDouble();
        double under = B - Math.round(B);
        long ke1 = Math.round(under*10);
        long ke2 = Math.round(under*100) - 10*ke1;

        final long a1 = A * (long)(B-under);
        final long a2 = A * ke1 / 10;
        final long a3 = A * ke2 / 100;
        System.out.println(a1+a2+a3);
    }
}
