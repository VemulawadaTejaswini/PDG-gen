import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split("")).mapToInt(Integer::parseInt).toArray();

        int opLength = input.length - 1;
        int opEnd = opLength - 1;

        for (int bit = 0; bit < (1<<opLength); bit++) {
            StringBuffer sb = new StringBuffer(2 *input.length - 1);
            sb.append(input[0]);
            long sum = input[0];

            for (int i = 0; i < opLength ; i++) {
                if ((bit & (1<<(opLength - 1 - i))) > 0) {
                    sum += input[i + 1];
                    sb.append("+");
                    sb.append(input[i + 1]);
                } else {
                    sum -= input[i + 1];
                    sb.append("-");
                    sb.append(input[i + 1]);
                }
            }

            if (sum == 7) {
                sb.append("=7");
                System.out.println(sb.toString());
                break;
            }
        }
    }
}
