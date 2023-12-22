import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int a = 0;
        int b = 0;
        int c = 0;
        for (int i = 0; i < 101; i++) {
            a = i;
            for (int j = 0; j < 101; j++) {
                b=j;
                if (a+b == X && 2*a+4*b == Y) {
                    c = c + 1;
                } else {
                    c = c;
                }
            }
        }
        if ( c >= 1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}