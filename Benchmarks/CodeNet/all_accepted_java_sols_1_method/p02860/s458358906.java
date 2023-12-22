import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // B - Echo

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        String s = sc.next();

        String s1 = s.substring(0, n / 2);
        String s2 = s.substring(n / 2, n);
        
        String ans = (n % 2 == 0 && s1.equals(s2) ? "Yes" : "No");
        
        System.out.println(ans);
    }

}