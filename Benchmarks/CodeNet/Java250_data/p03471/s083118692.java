import java.util.Scanner;

public class Main{

    static void isOK(int a, int b, int c, int N, int Y) {
        if(a+b+c == N && (a*10000)+(b*5000)+(c*1000) == Y) {
            System.out.println(a + " " + b + " " + c);
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int Y = scan.nextInt();
        int a = 0,b = 0,c;

        c = Y/1000;
        int tmp_c = c;
        isOK(a, b, c, N, Y);
        for(int i = 0; i < tmp_c/5; i++) {
            c -= 5;
            b++;
            if (a + b + c < N) {
                c += 5;
                b--;
                break;
            }
            isOK(a, b, c, N, Y);
        }

        int tmp_b = b;
        for(int i = 0; i < tmp_b/2; i++) {
            b -= 2;
            a++;
            isOK(a, b, c, N, Y);
        }

        System.out.println("-1 -1 -1");

    }
}