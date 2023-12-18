import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y =  sc.nextInt();
        int sum;
        int A = 15;

        if((X + Y) == A ){
            System.out.println("+");
        } else if((X * Y) == A ){
            System.out.println("*");
        } else{
            System.out.println("x");
        }
    }
}
