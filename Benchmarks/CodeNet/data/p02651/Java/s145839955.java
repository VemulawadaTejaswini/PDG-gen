import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        int[] answer = new int[t];

        for (int i = 0; i < t; i++) {
            int x = 0;
            int n = sc.nextInt();
            long[] aArray = new long[n];
            for (int j = 0; j < n; j++) {
                aArray[j] = sc.nextInt();
            }
            String s = sc.next();
            String[] sArray = new String[n];
            for (int j = 0; j < n; j++) {
                sArray[j] = s.substring(j, j + 1);
            }

            for (int j = 0; j < n; j++) {
                if (sArray[j].equals("0")) {
                    // x = 0にしたい人のターン
                    if ((x ^ aArray[j]) == 0) {
                        x = (int)(x ^ aArray[j]);
                    }
                } else {
                    // x = 0にしたくない人のターン
                    if ((x ^ aArray[j]) != 0) {
                        x = (int)(x ^ aArray[j]);
                    }
                }
            }
            if (x == 0) {
                answer[i] = 0;
            } else {
                answer[i] = 1;
            }
        }
        for (int i = 0; i < t; i++) {
            System.out.println(answer[i]);
        }
    }
}