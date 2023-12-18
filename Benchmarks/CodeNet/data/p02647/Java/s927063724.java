import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = in.nextInt();
        }
        for(int i=0; i<k; i++) {
            int[] increase = new int[n];
            int[] decrease = new int[n];
            for(int j=0; j<n; j++) {
                int left = Math.max(0, j-a[j]);
                increase[left]++;
                int right = j+a[j];
                if(right<n) {
                    decrease[right]++;
                }
            }
            a[0] = increase[0];
            boolean isAllN = true;
            for(int j=1; j<n; j++) {
                a[j] = a[j-1] - decrease[j-1] + increase[j];
                if(isAllN && a[j]!=n) {
                    isAllN = false;
                }
            }
            if(isAllN) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++) {
            sb.append(a[i]);
            if(i<n-1) {
                sb.append(' ');
            }
        }
        System.out.println(sb.toString());
    }
}
