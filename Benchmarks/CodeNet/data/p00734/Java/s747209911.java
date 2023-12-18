import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            if (N == 0 && M == 0) break;
            
            int total1 = 0;
            int total2 = 0;
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];
            
            for(int i = 0; i < N; i++) {
                arr1[i] = sc.nextInt();
                total1 += arr1[i];
            }
            for(int i = 0; i < M; i++) {
                arr2[i] = sc.nextInt();
                total2 += arr2[i];
            }
            
            int ans1 = -999;
            int ans2 = -999;
            boolean foundAnswer = false;
            
            for (int i = 0; i < N; i++) {
                int num1 = arr1[i];
                for (int j = 0; j < M; j++) {
                    int num2 = arr2[j];
                    if (total1 - num1 + num2 == total2 - num2 + num1) {
                        if (!foundAnswer) {
                            ans1 = num1;
                            ans2 = num2;
                        } else {
                            if (ans1 + ans2 > num1 + num2) {
                                ans1 = num1;
                                ans2 = num2;
                            }
                        }
                        foundAnswer = true;
                    }
                }
            }
            
            if (!foundAnswer) {
                System.out.println(-1);
            } else {
                System.out.println(ans1 + " " + ans2);
            }
        }
    }
}


