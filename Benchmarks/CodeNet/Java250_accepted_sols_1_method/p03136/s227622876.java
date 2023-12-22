import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumL = 0;
        int maxL = 0;
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            sumL += l;
            if (l > maxL) {
                maxL = l;
            }
        }
        if (maxL < sumL - maxL) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
