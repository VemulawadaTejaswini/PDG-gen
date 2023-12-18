import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> d = new ArrayList<>();
        for (int i=0; i<N; i++) {
            d.add(sc.nextInt());
        }
        
        int count = 0;
        for (int s=0; s<d.size()-1; s++) {
            for (int s2=s+1; s2<d.size(); s2++) {
                count += d.get(s)*d.get(s2);
            }
        }
        System.out.println(count);
        
    }
}