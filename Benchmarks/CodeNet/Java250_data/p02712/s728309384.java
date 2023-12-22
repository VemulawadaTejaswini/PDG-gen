import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Long n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLong();
        Long sum = n*(n+1)/2-(n-n%3+3)*(n/3)/2-(n-n%5+5)*(n/5)/2+(n-n%15+15)*(n/15)/2;
        System.out.println(sum);
    }
}
