import java.util.Scanner;

public class Main {
    public static void main(String[] ar) {
        Scanner sc = new Scanner(System.in);
        for (; ; ) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0)
                break;
            if(a>b) {
                int c=b;
                b=a;
                a=c;

            }
            System.out.println(a+" "+b);
            }
        }
    }
