
import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int tmp  = n * a;
        if(tmp > b) {
            System.out.println(b);
        }
        else  {
            System.out.println(tmp);
        }
    }
}
