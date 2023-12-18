import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // input
        int height = scan.nextInt();
        int width = scan.nextInt();
        int y = scan.nextInt();
        int x = scan.nextInt();

        // answer
        System.out.println((height - y) * (width - x));

    }
}