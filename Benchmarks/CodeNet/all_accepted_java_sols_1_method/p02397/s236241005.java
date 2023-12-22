
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while( x+y > 0 ){
            if(x > y){
                int a = x;
                x = y;
                y = a;
            }
            
            System.out.println(x+" "+y);
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
    }
}

