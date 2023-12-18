import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        
        
        if(x == 1 & y == 1){
            System.out.println(1000000);
        }else if(x <= 3 & y <= 3){
            System.out.println(400000 - (x * 100000) + 400000 - (y * 100000));
        }else if(x > 3 & y <= 3){
            System.out.println(400000 - (y * 100000));
        }else if(x <= 3 & y > 3){
            System.out.println(400000 - (x * 100000));
        }else{
            System.out.println(0);
        }
        
    }
}
