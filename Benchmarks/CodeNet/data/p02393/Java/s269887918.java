import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d;
        if(b < c){
            if(a < b){
                System.out.printf("%d %d %d\n", a, b, c);
            } else if (a < c) {
                d = a;
                a = b;
                b = d;
                System.out.printf("%d %d %d\n", a, b, c);
            } else {
                d = a;
                a = b;
                b = c;
                c = d; 
                System.out.printf("%d %d %d\n", a, b, c);
            }
        } else if (a < c) {
            d = b;
            b = c;
            c = d;
            System.out.printf("%d %d %d\n", a, b, c);
        } else if (a > b) {
            d = a;
            a = c;
            c = d;
            System.out.printf("%d %d %d\n", a, b, c);
        } else {
            d = a;
            a = c;
            c = b;
            b = d;
            System.out.printf("%d %d %d\n", a, b, c);
        }
        scan.close();
        }
    }
