import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int sum = 0;
        int sum2 = 0;
        int answer = 1000000;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
            sum += b[i];
        }
        for (int i = 0; i < a; i++) {
            sum -= b[i];
            sum2 += b[i];
            answer = Math.min(answer, Math.abs(sum - sum2));
        }
        System.out.println(answer);
    }
}