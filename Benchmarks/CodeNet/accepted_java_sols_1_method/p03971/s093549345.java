

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        char[] s = sc.next().toCharArray();
        int bCount = 0;
        int studentCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isPass = false;
            if (s[i] == 'a') {
                if (studentCount < a + b) {
                    studentCount++;
                    isPass = true;
                }
            }
            if (s[i] == 'b') {
                if (studentCount < a + b && bCount < b) {
                    studentCount++;
                    isPass = true;
                    bCount++;
                }
            }
            if (isPass) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
