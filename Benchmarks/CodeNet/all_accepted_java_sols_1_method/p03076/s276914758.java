import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] abcde = new int[5];
        for (int i = 0; i < 5; i++) {
            abcde[i] = sc.nextInt();
        }
        int minIdx = 0;
        int min = 9;
        for (int i = 0; i < 5; i++) {
            String target = String.valueOf(abcde[i]);
            int t = Integer.parseInt(target.substring(target.length() - 1));
            if (t != 0 && t < min) {
                minIdx = i;
                min = t;
            }
        }
        int tmp = abcde[minIdx];
        abcde[minIdx] = abcde[4];
        abcde[4] = tmp;
        int sum = 0;
        for (int i = 0; i < abcde.length; i++) {
            int target = abcde[i];
            if (i == 4) {
                sum += target;
                continue;
            }
            if (target % 10 == 0) {
                sum += (target / 10) * 10;
                continue;
            }
            sum += (target / 10 + 1) * 10;
        }
        System.out.println(sum);
    }

}
