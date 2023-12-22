import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = sc.nextInt();
        int max = sc.nextInt();

        int count = 0;
        for (int i = min; i <= max; i++) {
            if (isKaibun(i) == true) count++;
        }

        System.out.println(count);
    }

    private static boolean isKaibun(int n) {
        boolean isKaibun = true;

        char[] nCharArr = Integer.valueOf(n).toString().toCharArray();
        for (int i = 0; i < nCharArr.length; i++) {
            if (nCharArr[i] != nCharArr[nCharArr.length - i - 1]) {
                isKaibun = false;
                break;
            }
        }

        return isKaibun;
    }
}
