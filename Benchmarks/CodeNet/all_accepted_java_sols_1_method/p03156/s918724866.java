import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int P[] = new int[N];
        for (int i = 0; i < N; i++) {
            P[i] = sc.nextInt();
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int i = 0; i < N; i++) {
            if (P[i] <= A) {
                count1++;
            } else if (P[i] <= B) {
                count2++;
            } else if (P[i] > B) {
                count3++;
            }
        }
        int min = Math.min(count1, count2);
        min = Math.min(min, count3);
        System.out.println(min);
    }
}