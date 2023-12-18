import java.util.Scanner;


public class AOJ2330 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((int)Math.ceil(Math.log(n) / Math.log(3)));
    }

}