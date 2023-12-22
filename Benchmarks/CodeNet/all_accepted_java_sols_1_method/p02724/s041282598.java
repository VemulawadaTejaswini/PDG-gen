import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X=sc.nextInt();

        int gohyaku=0;
        int go=0;

        gohyaku=X/500;
        go=(X%500)/5;

        System.out.println((gohyaku*1000+go*5));
    }
}