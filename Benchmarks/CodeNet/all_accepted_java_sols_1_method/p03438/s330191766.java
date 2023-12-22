import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        long sumOfHalfOfPosDiffBA = 0; // b[i] - a[i] が正の時、その半分を集計
        long sumOfNegaDiffBA = 0; // b[i] - a[i] が負の時、それを集計
        for (int i = 0; i < n; i++) {
            int bi = sc.nextInt();
            int diffBA = bi - a[i];
            
            if (diffBA >= 0) {
                sumOfHalfOfPosDiffBA += diffBA / 2;
            } else {
                sumOfNegaDiffBA += diffBA;
            }
        }
        
        if (sumOfHalfOfPosDiffBA + sumOfNegaDiffBA >= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");            
        }
    }
}