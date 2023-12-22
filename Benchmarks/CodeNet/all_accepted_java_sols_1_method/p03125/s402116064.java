import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int a = scan.nextInt();
        int b = scan.nextInt();
        
        // answer
        if(b % a == 0){
            System.out.println(b + a);
        } else {
            System.out.println(b - a);
        }

    }
}