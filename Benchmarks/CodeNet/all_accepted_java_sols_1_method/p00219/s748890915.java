import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt();
            if (n == 0) {
                break;
            }
            int[] l = new int[10];
            while (n-- > 0) {
                l[sc.nextInt()]++;
            }
            for (int i : l) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                System.out.println(i==0?"-":"");
            }
        }
    }
}
