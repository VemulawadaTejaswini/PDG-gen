import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        String s = sc.next();
        char[] sArray = s.toCharArray();
        int passStudent = 0;
        int passStrudentAbroad = 0;
        for (int i = 0; i < n; i++) {
            String ans = "No";
            if (sArray[i] == 'a' && a + b > passStudent) {
                passStudent++;
                ans = "Yes";
            } else if (sArray[i] == 'b' && a + b > passStudent && passStrudentAbroad < b) {
                passStudent++;
                passStrudentAbroad++;
                ans = "Yes";
            }
            System.out.println(ans);
        }
    }

}