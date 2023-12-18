
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        
        while (true) {
            Scanner scan = new Scanner(System.in);
            int num = scan.nextInt();
            int i = 1;
            
            if (num == 0) {
                break;
            }
            System.out.println("Case "+ i +": "+ num);
        }
    }
}

