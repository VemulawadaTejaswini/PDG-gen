import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner s = new Scanner(System.in);
        int a;
        for(int i = 0; i < 5; i++){
            a = s.nextInt();
            if(a == 0){
                System.out.println(i + 1);
                return;
            }
        }
        
    }
}
