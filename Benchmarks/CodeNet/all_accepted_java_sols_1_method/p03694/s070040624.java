import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[]a = new int[N];

    for(int i=0; i<N; i++){
    a[i] = sc.nextInt();
}
    Arrays.sort(a);
    
    int max = a[N-1];
    int min = a[0];

	System.out.println(max-min);
      }
}