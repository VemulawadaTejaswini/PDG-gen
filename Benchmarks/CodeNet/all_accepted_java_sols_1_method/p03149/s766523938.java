import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] N = new int[4];
        int[] Y = new int[10];
        for (int i = 0; i < 4; i++) {
            N[i] = sc.nextInt();
            Y[N[i]]++;
        }
        if (Y[1] > 0 && Y[4] > 0 && Y[7] > 0 && Y[9] > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
