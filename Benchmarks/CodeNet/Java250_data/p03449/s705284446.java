import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] first = new int[n];
        int[] second = new int[n];
        int[] tmp = new int[n];
        
        for(int i = 0; i < n; i++) {
            int val = sc.nextInt();
            if(i==0) first[i] = val;
            else first[i] = first[i-1] + val;
        }
        for(int i = 0; i < n; i++) tmp[i] = sc.nextInt();
        for(int i = n-1; i >= 0; i--) {
            int val = tmp[i];
            if(i==n-1) second[i] = val;
            else second[i] = second[i+1] + val;
        }
        int res = 0;
        for(int i = 0; i < n; i++) {
            int max = Math.max(res, first[i]+second[i]);
            res = max;
        }
        System.out.println(res);
    }
}
