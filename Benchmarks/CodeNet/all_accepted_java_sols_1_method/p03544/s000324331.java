import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] Lucas = new long[N + 1];

        for (int i = 0; i < Lucas.length; i++) {
            if (i == 0) {
                Lucas[i] = 2;
            }else if (i == 1) {
                Lucas[i] = 1;
            }else{
                Lucas[i] = Lucas[i-2] + Lucas[i - 1];
            }
        }
        System.out.println(Lucas[N]);
    }
}