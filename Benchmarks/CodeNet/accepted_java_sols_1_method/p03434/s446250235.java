import java.util.*;

public class Main {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = Integer.parseInt(sc.next());
    	Integer a[] = new Integer[N];

    	for (int i=0; i<N; i++){
    		a[i] = Integer.parseInt(sc.next());
    	}

    	Arrays.sort(a, Collections.reverseOrder());

    	int ans = 0;

    	for(int i=0; i<N; i++){
    		if (i%2==0){
    			ans += a[i];
    		}else{
    			ans -= a[i];
    		}
    	}

    	System.out.println(ans);
    }
}