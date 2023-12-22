import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();
        int n = sc.nextInt();
        int[] pArray = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            pArray[i] = sc.nextInt();
        }

        for (int i = 0; i < 100; i++) {
            // x ± iがpArrayの中に存在しなかったらそれを答えとする
            boolean existFlag = false;
            for (int j = 0; j < n; j++) {
                if (pArray[j] == x - i) {
                    existFlag = true;
                }
            }
            if (!existFlag) {
                answer = x - i;
                break;
            }
            boolean existFlag2 = false;
            for (int j = 0; j < n; j++) {
                if (pArray[j] == x + i) {
                    existFlag2 = true;
                }
            }
            if (!existFlag2) {
                answer = x + i;
                break;
            }
        }

        System.out.println(answer);
    }
}