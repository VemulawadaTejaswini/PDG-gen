import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int x;

            if(a == 0 && b == 0){
                break;
            }

            if(a > b){
                x = a;
                a = b;
                b = x;
            }

            System.out.println(a + " " + b);
        }

    }
}
