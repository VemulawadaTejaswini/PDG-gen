import java.util.Scanner;

public class Main {
    public static final int max = 1000000;
    public static boolean[] ary;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ary = new boolean[max];
        ary[0] = true;
        ary[1] = true;
        ary[2] = false;
        
        for (int i = 2; i < max; i++) {
            setPrime(i);
        }
        
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int res = 0;
            for (int i = 0; i < n; i++) {
                if (!ary[i]) {
                    System.out.println(i);
                    res++;
                }
            }
            System.out.println(res);
        }
    }
    
    public static void setPrime(int num) {
        if (ary[num]) return;
        for (int i = 2; i < num; i++) {
            if (num%i == 0) {
                ary[num] = true;
            }
            if (i > Math.sqrt(num)) return;
        }
        for (int i = num*2; i < max; i=i+num) {
            ary[i] = true;
        }
    }
}