import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(new BufferedInputStream(System.in));
        long n=sc.nextLong();
        long k=sc.nextLong();
        n=n%k;
        n=Math.min(n,Math.abs(n-k));
        System.out.println(n);
    }
}
