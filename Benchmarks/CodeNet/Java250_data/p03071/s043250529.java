import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int a = scan.nextInt();
        int b = scan.nextInt();

        // answer
        if(a == b){
            System.out.println(a + b);
        } else {
            System.out.println(Math.max(a, b) * 2 - 1);
        }


    }
}