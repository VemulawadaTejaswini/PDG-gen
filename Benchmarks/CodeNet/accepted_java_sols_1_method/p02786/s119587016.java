import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        long numHP = sc.nextLong();
        long attackCnt = 0;

        if(numHP == 1) {
            attackCnt = 1;
        }
        
        for (int i=0; i<numHP; i++) {
            if(numHP >= Math.pow(2, i)) {
                if(numHP < Math.pow(2, i+1)) {
                    attackCnt = (long)Math.pow(2, i + 1) - 1;
                    break;
                }
            } 
        }

        
        System.out.println(attackCnt);
    }
}
