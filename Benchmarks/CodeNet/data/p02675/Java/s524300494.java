import java.util.*;

public class main{
    
    public static void main(String[] args){
        
        int n,k;
        
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = n%10;
        
        if(k == 2 || k == 4 || k == 5 || k == 9){
            System.out.println("hon");
        }
        else if(k == 3){
            System.out.println("bon");
        }
        else{
            System.out.println("pon");
        }
        
    }
    
}