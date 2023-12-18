import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] arrP = new int[101];
        for (int i = 0; i <= 100; i++) {
            arrP[i] = 0;
        }

        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            arrP[p] = 1;
        }

        int ans = 0;
        int index = 1;
        boolean canCheck = true;
        if (arrP[x] == 0) ans = x;
        else {
            while (canCheck) {
                if (x - index >= 0) {
                    if (arrP[x - index] == 0) {
                        ans = x - index;
                        break;
                    }
                }
                else {
                    ans = x - index;
                    break;
                }
                if (x + index <= 100) {
                    if (arrP[x + index] == 0) {
                        ans = x + index;
                        break;
                    }
                }
                index++;
            }
        }
        System.out.println(ans);
    }
}