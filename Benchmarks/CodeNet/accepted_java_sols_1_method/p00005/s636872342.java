
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while( scanner.hasNextLong() ){
            long a = scanner.nextInt();
            long b = scanner.nextInt();
            long x = a; 
            long y = b;
                while (!(x%y==0)) {     
                long z =x;
                x=y;
                y=z%y;   
                }
            long z = a/y;
            z = z*b;
            System.out.println(y+" "+z);
        }
    }
}

