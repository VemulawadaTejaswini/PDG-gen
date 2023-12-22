import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Integer a[] = new Integer[N];
      	a[0] = 0;
        for (int i=1; i<N; i++) {
            a[i] = sc.nextInt();
        }
        
        int[] res = new int[N];
        
        for (int i = 1; i < N; i++){
            res[a[i] - 1]++;
        }
      
	    for (int i = 0; i < N; i++){
            System.out.println(res[i]);
        }
    }
}