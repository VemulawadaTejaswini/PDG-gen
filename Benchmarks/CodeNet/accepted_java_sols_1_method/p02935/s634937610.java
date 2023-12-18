import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> v = new ArrayList<>();
        for(int i=0; i<N; i++){
            v.add(scanner.nextInt());
        }
        Collections.sort(v);
        double val = v.get(0);
        for(int i=1; i<N; i++){
            val = (val + v.get(i))/2.0;
        }

        System.out.println(val);
    }
}