import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] aArray = new int[n];
        int answer = 0;

        for (int i = 0; i < n; i++) {
            aArray[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (i != j && aArray[i] % aArray[j] == 0) {
                    flag = true;
                }
            }
            if (!flag) {
                answer++;
            }
        }

        System.out.println(answer);
    }
}