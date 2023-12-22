import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(b == 1) {
            System.out.println(0);
            return;
        }
        int count = a;
        int i = 1;
        for(; i<=20; i++) {
            if(b <= count) {
                break;
            }
            else {
                count += a - 1;
            }
        }
        System.out.println(i);
    }
}