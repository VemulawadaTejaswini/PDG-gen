import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sweet = N;
        if(N % 7 == 0){
            System.out.println("Yes");
        }else{
            while(sweet > 0){
            sweet =sweet - 4;
            if(sweet  % 7 == 0){
                System.out.println("Yes");
                break;
            }else{
                
            }
        }
        if(sweet < 0){
            System.out.println("No");
        }
        
        
        }
        
    }
}
