import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        for(int i=1;true;i++){
            int x = sc.nextInt();
            if(x!=0){    
                System.out.println("Case "+i+": "+x);
            }else{
               break;
            }
                
        }


    }
}
