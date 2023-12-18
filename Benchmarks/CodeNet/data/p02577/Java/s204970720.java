import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = str.length();
        int digitSum = 0;
        for (int i = 0; i < n; i++)
            digitSum += (str.charAt(i) - '0');
        if(digitSum % 9 == 0) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}

