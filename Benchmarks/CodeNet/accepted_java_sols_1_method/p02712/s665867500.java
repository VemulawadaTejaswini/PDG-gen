import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = Long.parseLong(sc.next());

        long sum = n*(n+1)/2;

        long n3 = n/3;
        long sum3 = 3*(n3*(n3+1)/2);
        long n5 = n/5;

        long sum5 = 5*(n5*(n5+1)/2);

        long n15 = n/15;
        long sum15 = 15*(n15*(n15+1)/2);

        System.out.println(sum-sum3-sum5+sum15);
        System.out.flush();
    }
}