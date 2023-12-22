import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int Acount = 0;
        
        for (int i = 0; i < 100; i++){
            Acount = i;
            
            int total = (A - 1) * Acount + 1;
            
            if (total >= B){
                break;
            }
        }
        
        System.out.println(Acount);
    }
}
