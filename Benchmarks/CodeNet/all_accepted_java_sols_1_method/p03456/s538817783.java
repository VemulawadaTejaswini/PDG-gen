import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner scan =new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        
        int c = Integer.parseInt(a + b);
        for(int i = 0; i <1000;i++){
            if ((i*i) == c){
                System.out.println("Yes");
                return;
            }
            
        }
        
        System.out.println("No");
        
    }
}
