import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a, x = 1;
        
        while(true){
            a = sc.nextInt();
            if(a == 0) break;
            
            System.out.println("Case "+ x +": "+ a); 
            x++;
        }
        
    }
}
