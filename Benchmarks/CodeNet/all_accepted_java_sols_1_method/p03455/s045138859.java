
// java
import java.util.Scanner;
import java.io.FileReader;
public class Main {
    public static void main(String[] args) {
        Scanner in = null;

        // read from local file for testing
        try {
            in = new Scanner(new FileReader("in.txt"));
        } catch (Exception e) { }

        // when submit your code, use this instead  
        in = new Scanner(System.in);

        int result = in.nextInt() * in.nextInt();
        if(result%2 == 0){
          System.out.println("Even");
        }
        else{
          System.out.println("Odd");
        }
        
    }
}