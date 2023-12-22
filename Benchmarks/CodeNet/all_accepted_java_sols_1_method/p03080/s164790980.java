import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        String[] str = s.split("");
        int rCount = 0;
        int bCount = 0;
        for (int i = 0; i < n; i++) {
            if ("B".equals(str[i])) {
                bCount++;
                continue;
            }
            rCount++;
        }
        if (rCount > bCount) {
            System.out.println("Yes");
            return;
        }
        System.out.println("No");
    }

}
