import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int K = sc.nextInt();
        int[] cus = new int[N];
        for (int i = 0; i < N; i++) {
            cus[i] = sc.nextInt();
        }
        Arrays.sort(cus);
        int ride = 0;
        int count = 0;
        int border = 0;
        boolean isFirst = true;
        for (int i = 0; i < cus.length; i++) {
            ride++;
            int c = cus[i];
            if (isFirst) {
                border = c;
                isFirst = false;
            } 
            if (i == cus.length-1) {
                count++;
                break;
            }
            if (ride == C) {
                count++;
                ride = 0;
                isFirst = true;
                continue;
            }
            if (K < cus[i+1]-border) {
                count++;
                ride = 0;
                isFirst = true;
            }
        }
        System.out.println(count);
    }    
}
