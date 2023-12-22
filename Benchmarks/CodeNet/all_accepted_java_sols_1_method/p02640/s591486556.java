import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        
        //String s = stdIn.next();
        boolean flag = false;
        
        for(int i = 0; i <= x; i++){
            if(i * 4 + (x - i) * 2 == y){
                flag = true;
                break;
            }
        }
        
        if(x == 0 && y == 0){
            flag = true;
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
