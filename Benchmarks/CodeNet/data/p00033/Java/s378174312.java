import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for (int i = 0; i < n; i++) {
            int[] pipeB = new int[10];
            int[] pipeC = new int[10];
            int topB = 0;
            int topC = 0;
            boolean isYes = true;
            
            for (int j = 0; j < 10; j++) {
                int ball = scanner.nextInt();
                if (topB == 0) {
                    pipeB[topB++] = ball;
                } else if (pipeB[topB-1] < ball) {
                        pipeB[topB++] = ball;
                } else if (topC == 0) {
                    pipeC[topC++] = ball;
                } else if (pipeC[topC-1] < ball) {
                        pipeC[topC++] = ball;
                } else {
                    isYes = false;
                    break;
                }
            }
            if (isYes) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            System.out.println(Arrays.toString(pipeB));
            System.out.println(Arrays.toString(pipeC));
        }
    }   
}