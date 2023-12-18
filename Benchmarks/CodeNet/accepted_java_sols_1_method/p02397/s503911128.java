import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        while(true){
            int x = Integer.parseInt(in.next()), y = Integer.parseInt(in.next());
            if(x == 0 && y == 0)break;

            if(x <= y)System.out.println(x +" "+ y);
            else System.out.println(y +" "+ x);
        }
    }
}
