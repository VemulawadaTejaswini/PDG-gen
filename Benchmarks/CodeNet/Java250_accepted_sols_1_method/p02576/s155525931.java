import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int t = sc.nextInt();
        int c = 0;
        c = (n%x == 0)?n/x:n/x+1;
        System.out.println(c*t);
    }
}