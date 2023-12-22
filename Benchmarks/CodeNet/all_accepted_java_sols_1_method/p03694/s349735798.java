import java.util.*;
import java.math.*;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int start = 1000;
        int goal = 0;
        int N = Integer.parseInt(sc.next());
        for (int i=0; i<N; i++){
            int input = Integer.parseInt(sc.next());
            start = Math.min(start, input);
            goal = Math.max(goal, input);
        }
        System.out.println(goal - start);
    }
}