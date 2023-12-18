import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] aArray = new int[n];
        int answer = 0;
        boolean exist1Flag = false;

        for (int i = 0; i < n; i++) {
            aArray[i] = sc.nextInt();
        }


        for (int i = 0; i < n; i++) {
            boolean flag = false;
            for (int j = 2; j < aArray[i] + 1; j++) {
                if (aArray[i] == 1) {
                    exist1Flag = true;
                    break;
                } else if (aArray[i] % j == 0) {
                    for (int j2 = 0; j2 < n; j2++) {
                        if (i != j2 && aArray[j2] == j) {
                            flag = true;
                            break;
                        }
                    }
                }
            }
            if (!flag) {
                answer++;
            }
        }

        if (!exist1Flag) {
            System.out.println(answer);
        }
    }
}