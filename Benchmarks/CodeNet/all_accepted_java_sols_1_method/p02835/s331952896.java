import java.util.*;

public class Main {

    
    public static void main(String[] args) {
        
        try(Scanner scanner = new Scanner(System.in)){

            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            if((a+b+c) >= 22){
                System.out.println("bust");
            }else{
                System.out.println("win");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
