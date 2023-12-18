import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        
        for(int i = 0; i < n; i++){
            System.out.println((int)(Math.random() * 25 + 1));
        }
        
        
        //System.out.println("XXXXXXXX");
    }
}
