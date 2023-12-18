
import java.util.*;
public class Main{

    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int d = scanner.nextInt();
       int t = scanner.nextInt();
       int s = scanner.nextInt();
       if(d/s <= t){
           System.out.println("Yes");
       } else {
           System.out.println("No");
       }
    }
    
}
