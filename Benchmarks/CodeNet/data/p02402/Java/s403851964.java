import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt() - 1, firstNUM = in.nextInt();
        int MAX = firstNUM, MIN = firstNUM;
        long SUM = firstNUM;

        for(int i = 0; i < n; i++){
            int ai = Integer.parseInt(in.next());
            if(ai > MAX)MAX = ai;
            else if(ai < MIN) MIN = ai;

            SUM += ai;
        }

        System.out.printf("%d %d ", MIN, MAX);
        System.out.println(SUM);
    }
}
