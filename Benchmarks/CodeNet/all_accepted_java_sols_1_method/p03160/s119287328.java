import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<Integer> asiba = new ArrayList<Integer>();
        for(int i = 0; i < N; i++){
            asiba.add(sc.nextInt());
        }
        ArrayList<Integer> cost = new ArrayList<Integer>();
        cost.add(0);
        cost.add(Math.abs(asiba.get(1) - asiba.get(0)));
        for(int i = 2; i < N; i++){
            int MAX = Math.abs(asiba.get(i) - asiba.get(i - 1)) + cost.get(i-1);
            int MAX2 = Math.abs(asiba.get(i) - asiba.get(i - 2)) + cost.get(i-2);
            if(MAX > MAX2) MAX = MAX2;
            cost.add(MAX);
        }
        System.out.println(cost.get(N -1));
        
    }
}