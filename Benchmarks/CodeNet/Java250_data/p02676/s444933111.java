import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        String s = sc.next();
        String[] list = s.split("");

        if (list.length <= k) {
            System.out.println(s);
            return;
        }

        for (int i = 0; i < k; i++) {
            System.out.print(list[i]);
        }
        System.out.print("...");
    }
}