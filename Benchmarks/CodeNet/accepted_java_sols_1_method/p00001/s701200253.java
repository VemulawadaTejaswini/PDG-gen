import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        int[] ary = new int[n];
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        
        for (int i = 1; i < n; i++) {
            int value = ary[i];
            for (int j = i-1;; j--) {
                if (j < 0) {
                    break;
                }
                if (ary[j] >= value) {
                    ary[j+1] = value;
                    break;
                }
                ary[j+1] = ary[j];
                ary[j] = value;
            }
        }
        for (int i = 0; i < 3; i++) {
            System.out.println(ary[i]);
        }
    }
}