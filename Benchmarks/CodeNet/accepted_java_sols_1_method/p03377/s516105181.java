import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int X = sc.nextInt();
        String ans = "YES";
        if(X<A||X>(A+B)) ans = "NO";
        System.out.println(ans);
    }
}