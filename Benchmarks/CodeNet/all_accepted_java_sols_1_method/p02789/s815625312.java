import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int N = stdIn.nextInt();        
        int M = stdIn.nextInt();        
        stdIn.close();

        if (N == M) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}