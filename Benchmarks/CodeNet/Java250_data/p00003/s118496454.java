import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 0; i < number; i++) {
            int []a = new int[3];
            a[0] = sc.nextInt();
            a[1] = sc.nextInt();
            a[2] = sc.nextInt();
            Arrays.sort(a);

            if (a[0] * a[0] + a[1] * a[1]==a[2] * a[2]) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}