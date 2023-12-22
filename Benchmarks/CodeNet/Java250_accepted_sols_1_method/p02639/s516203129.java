import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] xs = new int[5];
        int ans = 0;
        for(int i=0; i<xs.length; i++) {
            xs[i] = scanner.nextInt();
            if(xs[i] == 0) {
                ans = i+1;
            }
        }
        System.out.println(ans);
    }
}