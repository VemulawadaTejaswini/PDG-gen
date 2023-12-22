import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int[] b = new int[a];
        int[] c = new int[a];
        int sum = 0;
        for (int i = 0; i < a; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            c[i] = sc.nextInt();
        }
        for (int i = 0; i < a; i++) {
            if (b[i] - c[i]> 0) {
                sum += b[i]-c[i];
            }
        }
        System.out.println(sum);
    }
}