import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = input.nextInt();
        Arrays.sort(s);

        int q = input.nextInt();
        int cnt = 0;
        while (q-- > 0){
            int t = input.nextInt();
            int i = Arrays.binarySearch(s, t);

            if (0 <= i && i < n) cnt++;
        }
        System.out.println(cnt);
    }
}