import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] vi = new int[n];
        for(int i=0; i<n; i++) {
            vi[i] = in.nextInt();
        }
        int[] ci = new int[n];
        for(int i=0; i<n; i++) {
            ci[i] = in.nextInt();
        }
        int result = 0;
        for(int i=0; i<n; i++) {
            if(vi[i] > ci[i]) {
                result += vi[i] - ci[i];
            }
        }
        System.out.println(result);
    }
}
