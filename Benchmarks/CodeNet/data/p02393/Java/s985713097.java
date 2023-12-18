import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws java.io.IOException{
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int tmp;
        if (a>b) {
            tmp = b;
            b = a;
            a = tmp;
        }
        if (b>c) {
            tmp = c;
            c = b;
            b = tmp;
        }
        // ここまで最大値がきまる．
        if (a>b) {
         tmp = b;
            b = a;
            a = tmp;
        }
        System.out.println( a+ " "+ b+ " "+c);
    }
}