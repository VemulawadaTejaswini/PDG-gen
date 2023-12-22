import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int A = Integer.parseInt(sc.next());
        int B = Integer.parseInt(sc.next());

        int sum = 0;
        for (int i1 = 1; i1 <= N; i1++) {
            String iStr = Integer.toString(i1);
            int temp_sum = 0;
            for (int i2 = 0; i2 < iStr.length(); i2++) {
                int temp = Integer.parseInt(String.valueOf(iStr.charAt(i2)));
                temp_sum += temp;
            }
            if ((A <= temp_sum) && (temp_sum <= B)) {
                sum += i1;
            }
        }
        System.out.println(sum);
    }
}
