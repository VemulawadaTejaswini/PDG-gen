import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<String[]> list = new ArrayList<>();
        int count = 0;
        int N = 0;
        int M = 0;

        while (scan.hasNext()) {
            if (count == 0) {
                N = scan.nextInt();
                M = scan.nextInt();
                count++;
                continue;
            }
            String str = scan.nextLine();
            String[] sp = str.split(" ");
            list.add(sp);
            count++;
            if (count > N + 1) {
                break;
            }
        }


        int result[] = new int[30];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= Integer.parseInt(list.get(i)[0]); j++) {
                result[Integer.parseInt(list.get(i)[j]) - 1]++;
            }
        }

        int resultCount = 0;
        for (int r : result) {
            if (r == N) {
                resultCount++;
            }
        }
        System.out.print(resultCount);
    }
}
