
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Double> v = new PriorityQueue<>();
        for(int i=0;i<n;i++){
            v.add(sc.nextDouble());
        }
        while(v.size()>1){
            Double a = v.poll();
            Double b = v.poll();
            Double c = (a+b)/2.0;
            v.add(c);
        }
        System.out.println(v.poll());
    }
}