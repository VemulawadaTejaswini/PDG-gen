import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();

        int[] black = new int[n];
        for (int i = 1; i < n; i++) {
            black[i] = black[i-1] + (s[i-1] == '#' ? 1 : 0);
        }
        
        int[] white = new int[n];
        for (int i = n-2; i >= 0; i--) {
            white[i] = white[i+1] + (s[i+1] == '.' ? 1 : 0);
        }
        
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            min = Math.min(min, black[i] + white[i]);
        }
        
        System.out.println(min);
    }
}
