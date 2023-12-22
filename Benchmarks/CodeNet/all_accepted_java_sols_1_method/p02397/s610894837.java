import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int a, b, x;
        while(true){
            a = sc.nextInt();
            b = sc.nextInt();
            
            if(a == 0 && b == 0) break;
            if(b < a){
                x = a;
                a = b;
                b = x;
            }
            System.out.println(a +" "+ b); 
        }
        
    }
}
