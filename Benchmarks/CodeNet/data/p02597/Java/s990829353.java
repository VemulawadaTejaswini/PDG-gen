import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char[] c = new char[n];
        c = in.next().toCharArray();

        int ans = 0;
        int i = 0, j = n - 1; 
        while (i < j) {
            while (i < n && c[i] == 'R') {
                i++;
            }
            while (j >= 0 && c[j] == 'W') {
                j--;
            }

            if (i >= j) {
                break;
            }

            ans++;
            i++;
            j--;
        }

        System.out.println(ans);

    }
}