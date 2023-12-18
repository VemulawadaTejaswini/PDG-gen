import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < p.length; i++) {
            p[i] = sc.nextInt();
        }
        int check = 0;
        for (int i = 0; i < p.length; i++) {
            if (p[i] != i + 1) {
                check++;
            }
        }
        if (check == 2 || check == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        sc.close();
    }
}