import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N = Integer.parseInt(sc.next());
      int K = Integer.parseInt(sc.next());
      int [] array = new int[N];
      Arrays.fill(array, 0);
      int count = 0;
        for(int i = 0; i < K; i++){
            int d = Integer.parseInt(sc.next());
            for(int j = 0; j < d; j++){
                int x = Integer.parseInt(sc.next())-1;
                array[x]++;
            }
        }
 
    for(int i = 0; i < N; i++){
        if(array[i] == 0){
            count++;
        }
    }
    System.out.println(count);
    }

}
