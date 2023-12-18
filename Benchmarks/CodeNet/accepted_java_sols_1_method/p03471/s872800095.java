import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int res10000 = -1;
        int res5000  = -1;
        int res1000  = -1;

        for (int a=0; a<=N; a++) {
            boolean breakFlag = false;
            for (int b=0; b<=N-a; b++) {
                int c = N - a - b;
                int total = a * 10000 + b * 5000 + c * 1000;
                if (total == Y) {
                    res10000 = a;
                    res5000  = b;
                    res1000  = c;
                    breakFlag = true;
                    break;
                }
            }
            if (breakFlag) break;
        }

        System.out.println(res10000 + " " + res5000 + " " + res1000);
    }
}
