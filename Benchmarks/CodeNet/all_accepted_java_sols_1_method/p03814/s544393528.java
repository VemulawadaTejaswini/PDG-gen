import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] C = sc.next().toCharArray();
        sc.close();

        int n = C.length;
        int st = 0;
        for (int i = 0; i < n; ++i) {
            if (C[i] == 'A') {
                st = i;
                break;
            }
        }
        int gl = 0;
        for (int i = n - 1; i >= 0; --i) {
            if (C[i] == 'Z') {
                gl = i;
                break;
            }
        }

        System.out.println(gl - st + 1);
	}
}
