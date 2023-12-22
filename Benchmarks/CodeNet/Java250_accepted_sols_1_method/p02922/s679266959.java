import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        
        int i;
        for(i = 0; i < 30; i++){
            if((A - 1) * i + 1 >= B) break;
        }
        
        System.out.println(i);
    }
}
