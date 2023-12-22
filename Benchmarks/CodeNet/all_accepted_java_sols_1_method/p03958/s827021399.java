import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int t = sc.nextInt();
        int[] ar = new int[t];
        for (int i = 0; i < t; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);
        int total = ar[ar.length - 1] - 1;
        int curr = ar[ar.length - 1];
        for(int i = ar.length - 2; i >= 0; i--){
            if(total >= ar[i])
                total -= ar[i];
            else
                total = 0;
            curr += ar[i];
        }
        System.out.println(total);
    }
}