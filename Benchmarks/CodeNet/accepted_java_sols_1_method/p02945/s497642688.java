import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        int a = stdIn.nextInt();
        int b = stdIn.nextInt();

        int x = a*b;
        int y = a+b;
        int z = a-b;
        if(x >= y && x >= z) {
            System.out.println(x);
        }else if(y > x && z <=y) {
            System.out.println(y);
        }else {
            System.out.println(z);
        }
    }

}