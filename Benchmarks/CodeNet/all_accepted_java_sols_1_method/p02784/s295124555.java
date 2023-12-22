import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        int health = Integer.parseInt(scan.next()); 
        int varN   = Integer.parseInt(scan.next());
        ArrayList<Integer> attack = new ArrayList<Integer>();
        for(int i=0; i<varN; i++){
            attack.add( Integer.parseInt( scan.next() ) );
        }

        boolean flag = false;

        for(int i=0; i<varN; i++){
            health -= attack.remove(0);

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