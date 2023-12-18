//４つの数字を+-を使って7にする
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();

        int[] a = new int[4];
        int[] b = new int[8];
        int N = 7;

        for (int i = 0; i < 4; i++) {
            a[3-i] = x%10;
            x = x/10;
        }

        b[0] = a[0]+a[1]+a[2]+a[3];
        b[1] = a[0]+a[1]+a[2]-a[3];
        b[2] = a[0]+a[1]-a[2]+a[3];
        b[3] = a[0]+a[1]-a[2]-a[3];
        b[4] = a[0]-a[1]+a[2]+a[3];
        b[5] = a[0]-a[1]+a[2]-a[3];
        b[6] = a[0]-a[1]-a[2]-a[3];
        b[7] = a[0]-a[1]-a[2]+a[3];
        if(b[0] == N)
            System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "+" + a[3] + "=" + N);
        else if(b[1] == N)
            System.out.println(a[0] + "+" + a[1] + "+" + a[2] + "-" + a[3] + "=" + N);
        else if(b[2] == N)
            System.out.println(a[0] + "+" + a[1] + "-" + a[2] + "+" + a[3] + "=" + N);
        else if(b[3] == N)
            System.out.println(a[0] + "+" + a[1] + "-" + a[2] + "-" + a[3] + "=" + N);
        else if(b[4] == N)
            System.out.println(a[0] + "-" + a[1] + "+" + a[2] + "+" + a[3] + "=" + N);
        else if(b[5] == N)
            System.out.println(a[0] + "-" + a[1] + "+" + a[2] + "-" + a[3] + "=" + N);
        else if(b[6] == N)
            System.out.println(a[0] + "-" + a[1] + "-" + a[2] + "-" + a[3] + "=" + N);
        else if(b[7] == N)
            System.out.println(a[0] + "-" + a[1] + "-" + a[2] + "+" + a[3] + "=" + N);

    }
}