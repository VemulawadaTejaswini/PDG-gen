import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a = n / 500;
        n -= 500*a;
        int b = n / 5;
        System.out.println(a*1000 + b*5);
    }
}
