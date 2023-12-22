import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        for (int i = 1; ; i++) {
            int sum = (y + z) * i + z;
            if(x < sum) {
                System.out.println(i - 1);
                return;
            }
        }
    }
}