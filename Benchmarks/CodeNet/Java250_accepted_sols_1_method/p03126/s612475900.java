import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int N = 0;
        int M = 0;
        int[] result = new int[30];

        while (scan.hasNext()) {
            if (count == 0) {
                N = scan.nextInt();
                M = scan.nextInt();
                scan.nextLine();
                count++;
                continue;
            }
            String str = scan.nextLine();
            String[] splited = str.split(" ");
            for (int j = 1; j <= Integer.parseInt(splited[0]); j++) {
                result[Integer.parseInt(splited[j]) - 1]++;
            }

            if (++count > N) {
                break;
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
