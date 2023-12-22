import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int woods = scan.nextInt();
        int peoples = scan.nextInt();

        // answer
        System.out.println((int)Math.ceil((double)woods / (peoples * 2.0 + 1.0)));

    }
}