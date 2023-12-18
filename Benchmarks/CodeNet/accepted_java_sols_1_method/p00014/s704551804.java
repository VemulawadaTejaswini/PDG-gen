import java.util.*;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (scanner.hasNext()) {
           int d = scanner.nextInt();
           int sum = 0;
           
           for (int i = 0; i < 600; i+=d) {
               sum += d * (i*i);
           }
           System.out.println(sum);
        }
    }
}