import java.util.*;

public class Main {
    public static void main(String[] args){
        // Your code here!
        Scanner sc = new Scanner(System.in);
        
        String r = sc.next();
        String g = sc.next();
        String b = sc.next();
        
        String str = r + g + b;
        int num = Integer.parseInt(str);
        
        if((num % 4) == 0 ){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
    
}
