import java.util.*;

public class Main {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        String str = sc.nextLine();
        String ans = "";
      
        
        for(int i = 0; i < str.length(); ++i) {
            ans += 'x';
        }
        
        System.out.println(ans);
        
    }
}