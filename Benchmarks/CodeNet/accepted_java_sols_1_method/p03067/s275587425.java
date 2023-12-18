import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // A - On the Way

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        boolean onC = (a < c && c < b) ||  (a > c && c > b);

        String ans = onC ? "Yes" : "No";
        
        System.out.println(ans);
    }

}