import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<Integer> A = new ArrayList<>(N);
        for(int i=0;i<N;i++){
            A.add(sc.nextInt());
        }
        final int sum = A.stream().collect(Collectors.summingInt(p->p));
        boolean yn = A.stream().filter(ai-> sum <= ai*4*M).count() >= M;
        if(yn){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

}
