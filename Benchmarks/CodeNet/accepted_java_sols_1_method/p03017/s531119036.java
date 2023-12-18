import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt()-1;
        int B = sc.nextInt()-1;
        int C = sc.nextInt()-1;
        int D = sc.nextInt()-1;
        String S = sc.next();
        if (C < D) {
            int obs = 0;
            for (int i = B; i <= D; i++) {
                if (S.charAt(i) == '#') {
                    obs++;
                } else {
                    obs = 0;
                }
                if (obs == 2) {
                    System.out.println("No");
                    return;
                }
            }
            obs = 0;
            for (int i = A; i <= C; i++) {
                if (S.charAt(i) == '#') {
                    obs++;
                } else {
                    obs = 0;
                }
                if (obs == 2) {
                    System.out.println("No");
                    return;
                }
            }
        } else {
            int obs = 0;
            int safe = 0;
            boolean safety = false;
            for (int i = B; i <= D; i++) {
                if (S.charAt(i) == '#') {
                    obs++;
                    safe = 0;
                } else {
                    safe++;
                    obs = 0;
                }
                if (safe == 3) {
                    safety = true;
                }
                if (obs == 2) {
                    System.out.println("No");
                    return;
                }
            }
            if (S.charAt(B+1) == '.' && S.charAt(B-1) == '.') {
                safety = true;
            } else if (S.charAt(D-1) == '.' && S.charAt(D+1) == '.') {
                safety = true;
            }
            if (!safety) {
                System.out.println("No");
                return;
            }
            obs = 0;
            for (int i = A; i <= C; i++) {
                if (S.charAt(i) == '#') {
                    obs++;
                } else {
                    obs = 0;
                }
                if (obs == 2) {
                    System.out.println("No");
                    return;
                }
            }
        }
        System.out.println("Yes");
    }    
}
