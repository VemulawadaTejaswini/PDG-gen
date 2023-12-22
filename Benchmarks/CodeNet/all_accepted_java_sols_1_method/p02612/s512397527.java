import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int rest = 0;
        int senyen = 0;
        if(n % 1000 == 0) {
            senyen = n % 1000;
            System.out.println(senyen);
        } else {
            rest = n % 1000;
            System.out.println(1000 - rest);
        }
    }
}
