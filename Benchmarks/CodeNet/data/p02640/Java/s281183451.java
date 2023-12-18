import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        int x = stdIn.nextInt();
        int y = stdIn.nextInt();
        
        //String s = stdIn.next();
        boolean flag = false;
        
        for(int i = 0; i < x; i++){
            //System.out.println(i * 4 + (x - i) * 2);
            if(i * 4 + (x - i) * 2 == y){
                flag = true;
                break;
            }
        }
        
        if(flag){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
