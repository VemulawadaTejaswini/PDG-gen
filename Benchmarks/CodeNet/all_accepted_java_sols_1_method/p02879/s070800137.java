import java.util.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int A,B;

        A = sc.nextInt();
        B = sc.nextInt();

       
        if(A >= 10 || B >= 10) {
            System.out.print("-1");
        } else {
            System.out.print(A * B);
        }

        sc.close();


    }
}