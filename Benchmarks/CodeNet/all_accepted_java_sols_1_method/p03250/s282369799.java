import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int p[] = new int[3]; 
        p[0] = sc.nextInt();
        p[1] = sc.nextInt();
        p[2] = sc.nextInt();
        sc.close();

        Arrays.sort(p);
        System.out.println(p[2] * 10 + p[1] + p[0]);
    }
}
