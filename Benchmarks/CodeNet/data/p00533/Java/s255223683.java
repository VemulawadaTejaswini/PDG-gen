import java.util.*;

public class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < h; i++) {
            char[] arr = sc.next().toCharArray();
            int result = -1;
            for (int j = 0; j < w; j++) {
                if (j != 0) {
                    sb.append(" ");
                }
                if (arr[j] == 'c') {
                    result = 0;
                } else if (result != -1) {
                    result++;
                }
                sb.append(result);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
