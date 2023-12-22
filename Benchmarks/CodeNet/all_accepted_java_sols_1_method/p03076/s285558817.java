import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int[] f = {a,b,c,d,e};
        int time = 0;
        int max = 0;
        for (int n: f) {
            if (n%10 == 0) {
                time += n;
            } else {
                time += n + (10-n%10);
                if (max < (10-n%10)) {
                    max = 10-n%10;
                }
            }
        }
        System.out.println(time-max);
    }
}
