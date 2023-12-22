import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer[] a = new Integer[N];
        for(int i = 0; i < N; i++){
          a[i] = sc.nextInt();
        }
        int sum = 0;
        Arrays.sort(a, Collections.reverseOrder());
        for(int i = 0; i < N; i++){
          if(i % 2 == 0){
            sum += a[i];
          } else {
            sum -= a[i];
          }
        }
        
        System.out.println(sum);
    }
}
