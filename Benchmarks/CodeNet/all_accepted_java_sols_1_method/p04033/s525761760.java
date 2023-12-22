import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        
        String ans = "";
        if(a < 0 && b >= 0) {
            ans = "Zero";
        }
        else if(a >= 0 && b >= 0) {
            if(a == 0 || b == 0) ans = "Zero";
            else ans = "Positive";
        }
        else {
            ans = ((b - a + 1) % 2 == 0) ? "Positive" : "Negative";
        }

        System.out.println(ans);
    }
}
