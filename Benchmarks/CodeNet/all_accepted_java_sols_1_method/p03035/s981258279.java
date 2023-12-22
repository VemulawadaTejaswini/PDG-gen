import java.util.Scanner;
import java.util.Arrays;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int age = scan.nextInt();
        int price = scan.nextInt();

        // answer
        if(age >= 13){
            System.out.println(price);
        } else if (age >= 6){
            System.out.println(price / 2);
        } else {
            System.out.println(0);
        }

    }
}