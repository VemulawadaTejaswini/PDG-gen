import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for (int i = 1; i < number; i++) {
            int []a = new int[3];
                for (int j = 0; j<3; j++) {
                    a[j]=sc.nextInt();
                }
            Arrays.sort(a);

            if (a[0] * a[0] + a[1] * a[1]==a[2] * a[2]) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}