import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n / 1000;
        int b = n % 1000;
        int r = 0;
        if(b != 0){
            r = 1000 * (a + 1) - n;
        }
        System.out.println(r);
    }
}