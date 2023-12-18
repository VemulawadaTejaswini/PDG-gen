import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> val = new ArrayList<>();
        for(int i= 0;i<N;i++){
            int A = scanner.nextInt();
            val.add(A);
        }
        Map<Integer,Integer> maxLeft = new HashMap<>();
        Map<Integer,Integer> maxRight = new HashMap<>();
        maxLeft.put(0,0);
        maxLeft.put(1,val.get(0));
        for(int i=2; i<N; i++){
            int ml = Math.max(maxLeft.get(i-1), val.get(i-1));
            maxLeft.put(i, ml);
        }
        maxRight.put(N-1, 0);
        maxRight.put(N-2, val.get(N-1));
        for(int i=N-3; i>=0; i--){
            int mr = Math.max(maxRight.get(i+1), val.get(i+1));
            maxRight.put(i, mr);
        }
        // System.out.println(maxLeft);
        // System.out.println(maxRight);

        for(int i=0; i<N; i++){
            System.out.println(Math.max(maxLeft.get(i), maxRight.get(i)));
        }
    }
}