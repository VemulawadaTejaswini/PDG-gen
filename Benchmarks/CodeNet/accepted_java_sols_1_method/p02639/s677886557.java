import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner scan = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++){
            int x = scan.nextInt();
            
            if (x == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
