import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next() + sc.next();
        sc.close();
        int num = Integer.parseInt(str);

        int rt = (int) Math.sqrt(num);

        if (rt * rt == num) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
