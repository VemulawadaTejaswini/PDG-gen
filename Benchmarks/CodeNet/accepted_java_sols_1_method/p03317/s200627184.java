import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y =  sc.nextInt();
        int sum;
        int A;

        //int val = X;
        //int valLen = String.valueOf( val ).length();

        sum = (X-1) % (Y-1);
        A = (X-1) / (Y-1);
        if(sum > 0){
            A++;
        }

        System.out.println(A);


    }
}
