import java.util.*;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> sets = new HashSet<>();
        int X = sc.nextInt();
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            sets.add(sc.nextInt());
        }
        for(int i=0;i<2*N+20;i++){
            if(!sets.contains(X-i)){
                System.out.println(X-i);
                return;
            }
            if(!sets.contains(X+i)){
                System.out.println(X+i);
                return;
            }
        }
        System.out.println(0);
    }


}
