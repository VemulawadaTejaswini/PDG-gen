import java.util.Scanner;
 
public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int d = stdIn.nextInt();

        System.out.println((int)Math.ceil((double)n / (2 * d + 1)));
    }
}