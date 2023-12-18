import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        String s = scan.next();

        int[] sum = new int[n];
        sum[0] = (s.charAt(0) == 'W') ? 0 : 1;
        for(int i = 1; i < n; i++) {
            sum[i] = (s.charAt(i) == 'W') ? 0 : 1;
            sum[i] += sum[i-1];
        }

        int min = sum[n-1]-sum[0];
        int turn1, turn2;
        for(int i = 1; i < n; i++) {
            turn1 = i-sum[i-1];
            turn2 = sum[n-1]-sum[i];
            min = (turn1+turn2 < min) ? turn1+turn2 : min;
        }

        System.out.println(min);
    }
}