import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;
        if(c<b) {
            temp = c;
            c = b;
            b = temp;
        }

        if(b<a) {
            temp = a;
            a = b;
            b = temp;
        }

        if(c<b){
            temp = c;
            c = b;
            b = temp;
        }

        System.out.println(a + " " + b + " " + c);
    }
}
