import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = (n+1)/2;

        System.out.println((double)a/n);
        sc.close();
    }
}