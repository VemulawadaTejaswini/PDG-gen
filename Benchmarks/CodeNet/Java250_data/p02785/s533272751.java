import java.util.*;
public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> List = new ArrayList<>();
        long N = sc.nextLong();
        long K = sc.nextLong();
        for(int i=0;i<N;i++) List.add(sc.nextLong());
        Collections.sort(List,Collections.reverseOrder());
        long sum = 0;
        for(long i=K;i<List.size();i++) sum+=List.get((int)i);
        System.out.println(sum);
    }
}