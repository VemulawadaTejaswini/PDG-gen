import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] n = sc.next().toCharArray();
        for (int i = 0 ;i < n.length ; i++) {
            if (i % 2 == 0) {
                if (n[i] == 'L') {
                    System.out.println("No");
                    return;
                }
            } else {
                if (n[i] == 'R') {
                    System.out.println("No");
                    return;
                }
            }
        }

        System.out.println("Yes");
    }

}
