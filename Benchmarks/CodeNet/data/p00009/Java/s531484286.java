import java.util.Scanner;

public class Main {
    public static Scanner sc;
    public static int[] ary;
    public static void main(String[] args) throws Exception {
        sc = new Scanner(System.in);
        ary = new int[1000000];
        
        for (int i = 0; i < 1000000; i++) {
            ary[i] = -1;
        }
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            for (int i = 2; i <= n; i++) {
                if (isPrime(i)) {
                    res++;
                    System.out.println(i);
                }
            }
            System.out.println(res);
        }
    }
    
    public static boolean isPrime(int num) {
        if (num == 2 || num == 3) {
            ary[num] = 1;
            return true;
        }
        
        if (ary[num] == 1) return true;
        if (ary[num] == 0) return false;
        
        for (int i = 2; i < num; i++) {
            for (int j = i; j*j <= num; j++) {
                if (num%j == 0) {
                    ary[num] = 0;
                    return false;
                }
            }
        }
        ary[num] = 1;
        return true;
    }
}