import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception{
        // Your code here!
     		Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int i = a * b;
            if(i % 2==0){
                System.out.println("Even");
                
            }
            if(i % 2!=0){
                System.out.println("Odd");
                
            }
        
    }
}