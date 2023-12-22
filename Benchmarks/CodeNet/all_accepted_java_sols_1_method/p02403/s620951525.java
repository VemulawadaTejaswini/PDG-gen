import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int[] a = new int[]{sc.nextInt(), sc.nextInt()};
            if (a[0] == 0 && a[1] == 0) {
                break;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < a[0]; i++) {
                for (int j = 0; j < a[1]; j++) {
                    sb.append("#");
                }
                sb.append("\n");
            }
            System.out.println(sb.toString());
        }
    }
}