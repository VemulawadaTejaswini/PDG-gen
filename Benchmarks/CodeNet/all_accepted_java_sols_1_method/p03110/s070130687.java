import java.util.Scanner;
import java.util.Arrays;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double x = 0;
        String u;
        double total = 0;

        for(int i = 0; i < N; i++){
            x = scan.nextDouble();
            u = scan.next();
            if(u.equals("BTC") ){
                x = x * 380000.0;
            }
            total = total + x;

        }



        System.out.println(total);
    }
}