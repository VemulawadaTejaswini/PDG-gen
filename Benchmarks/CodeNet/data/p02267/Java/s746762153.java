import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ary = new int[n];
        
        for (int i = 0; i < n; i++) {
            ary[i] = sc.nextInt();
        }
        
        n = sc.nextInt();
        int[] t = new int[n];
        
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (isContain(t[i], ary)) {
                res++;
            }
        }
        
        System.out.println(res);
    }
    
    public static boolean isContain(int num, int[] ary) {
        int j = 0;
        while (j < ary.length) {
            if (num == ary[j]) {
                return true;
            }
            j++;
        }
        return false;
    }
}