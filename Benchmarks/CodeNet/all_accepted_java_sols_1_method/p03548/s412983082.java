import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int i = 1;
        while (true) {
            int width = y * i + z * (i + 1);
            if (x < width) {
                break;
            }
            i++;

        }
        System.out.println(i - 1);
    }

}
