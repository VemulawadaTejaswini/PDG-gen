import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        ArrayList<Integer> takos = new ArrayList<Integer>();
        for(int i = 0;i < N;i++){
            takos.add(sc.nextInt());
        }
        for(int i = 0;i < N;i++){
            for(int j = i + 1;j < N;j++){
                total += takos.get(i) * takos.get(j);
            }
        }
        System.out.println(total);
    }
}
