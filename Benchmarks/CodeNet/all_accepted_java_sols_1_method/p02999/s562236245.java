import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int x = scan.nextInt();
        int a = scan.nextInt();

        // answer
        if(x < a){
            System.out.println(0);
        } else {
            System.out.println(10);
        }

    }
}