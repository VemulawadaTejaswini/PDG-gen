import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	Integer a[] = new Integer[N];
        for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
      
      	Arrays.sort(a, Collections.reverseOrder());
      	long ans = 0;
      
      	for (int i=1; i<N; i++) {
            ans += a[i-1];
          	//System.out.println(a[i-1]);
        }
      
       	System.out.println(ans);
    }
}