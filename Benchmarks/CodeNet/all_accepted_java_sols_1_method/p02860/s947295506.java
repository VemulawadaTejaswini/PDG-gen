import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        
        if (N % 2 == 1) {
            System.out.println("No");
        } else {
            String t1 = S.substring(0, N / 2);
            String t2 = S.substring(N / 2, N);
            
            if (t1.equals(t2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
