import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        
        if(a>=c){
            if(a-c<=d){
                System.out.println("Yes");
            }
            else if(a-b<=d && b-c<=d){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            
        }
        
        else{
            if(c-a<=d){
                System.out.println("Yes");
            }
            else if(c-b<=d && b-a<=d){
                System.out.println("Yes");
            }
            
            else{
                System.out.println("No");
            }
        }
    }
}