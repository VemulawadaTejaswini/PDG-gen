import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> d = new ArrayList<>();
        for(int i=0; i<N; i++){
            d.add(scanner.nextInt());
        }
        Collections.sort(d);
        int from = d.get(N/2-1);
        int to = d.get(N/2);
        System.out.println(to-from);
    }
}