import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        int health = Integer.parseInt(scan.next()); 
        int varN   = Integer.parseInt(scan.next());
        int attack = 0;

        boolean flag = false;

        for(int i=0; i<varN; i++){
            attack = Integer.parseInt(scan.next());
            health -= attack;

            if(health <= 0){
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