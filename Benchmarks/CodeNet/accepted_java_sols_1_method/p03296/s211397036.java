import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
        }


        int leftColor  = a[0];
        int result = 0;
        for (int i = 1; i < N; i++) {
            int centerColor = a[i];
            if (leftColor == centerColor) {
                result ++;
                leftColor = 100001;
            }else{
                leftColor = centerColor;
            }

        }
        System.out.println(result);
    }
}
