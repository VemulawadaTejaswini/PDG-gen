
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int amount = s.nextInt();
        int rem = amount % 1000;
        if(rem == 0) {
            System.out.println(rem);
        } else {
            System.out.println(1000-rem);
        }
   }
}