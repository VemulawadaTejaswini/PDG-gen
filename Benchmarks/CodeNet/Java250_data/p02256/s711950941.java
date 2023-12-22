import java.util.Scanner;

public class Main{
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int gcd;
        while(true){
            if(a > b){
                int c = a;
                a = b;
                b = c;
            }
            if(b % a == 0){
                gcd = a;
                break;
            }else{
                b = b % a;
            }
        }
        System.out.println(gcd);
        scanner.close();
    }
}
