
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();

         if(X * 4 > Y){
             System.out.println("Yse");
         }else{
             System.out.println("No");
         }
    }
}
