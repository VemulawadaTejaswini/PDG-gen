import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int distance = sc.nextInt();
        long x,y;
        int count = 0;

        for (int i = 0; i < num; i++) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (Math.sqrt(x * x + y * y) <= distance) {
                count++;
            }
        }
        sc.close();
        System.out.println(count);
    }
}
