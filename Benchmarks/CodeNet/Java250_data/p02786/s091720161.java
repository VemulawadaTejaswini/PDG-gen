import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        long health = Long.parseLong(scan.next());
        health = Recursive(health);
        System.out.println(health);
    }

    public static long Recursive(long health){
        if(health == 1){
            return health;
        }else{
            long returnNum = Recursive(health/2);
            return 2*returnNum + 1;
        }
    }
}