import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        int health = Integer.parseInt(scan.next()); 
        int attack = Integer.parseInt(scan.next());

        if( health % attack == 0 ){
            System.out.println( health/attack );
        }else{
            System.out.println( health/attack + 1);
        }
    }
}