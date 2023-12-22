import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int a = stdIn.nextInt();
        int p = stdIn.nextInt();
        
        System.out.println((3 * a + p) / 2);
    }
}
