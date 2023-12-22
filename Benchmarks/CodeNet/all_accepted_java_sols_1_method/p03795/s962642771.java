import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int input = sc.nextInt();
        int eat = 800 * input;
        int back = (input / 15) * 200;

        System.out.println(eat - back);
    }
}