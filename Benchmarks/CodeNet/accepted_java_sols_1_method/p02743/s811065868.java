import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        if(a+b>=c){
            System.out.println("No");
        }else if(4*a*b>=(c-a-b)*(c-a-b)){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
        
        
        
 
    }



}