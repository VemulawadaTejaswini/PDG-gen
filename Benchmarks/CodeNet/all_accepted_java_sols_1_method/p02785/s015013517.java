import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        int varN   = Integer.parseInt(scan.next());
        int kill   = Integer.parseInt(scan.next());
        Integer[] health = new Integer[varN];

        for(int i=0; i<varN; i++){
            health[i] = Integer.parseInt(scan.next());
        }

        if(varN <= kill){
            System.out.println(0);
        }else{
            Arrays.sort(health, Comparator.reverseOrder() );

            long attack = 0;
            for(int i=kill; i<varN; i++){
                attack += health[i];
            }
            System.out.println(attack);
        }

    }
}