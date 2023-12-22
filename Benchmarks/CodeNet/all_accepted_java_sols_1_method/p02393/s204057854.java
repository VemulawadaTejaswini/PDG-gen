import java.util.Scanner;

public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a > b) {
            int d = a;
            a = b;
            b = d;
        }

        if(b > c) {
            int d = b;
            b = c;
            c = d; 
        }

        if(a > b) {
            int d = a;
            a = b;
            b = d;
        }

        System.out.println(a + " " + b + " " + c);
	}
}
