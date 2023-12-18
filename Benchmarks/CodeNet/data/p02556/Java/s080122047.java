import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        //int K = sc.nextInt();
        //long N = sc.nextLong();

        long[] x = new long[N];
        long[] y = new long[N];
        for(int i=0; i<N; i++){
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
            long xx = x[i];
            x[i] = x[i] + y[i];
            y[i] = xx - y[i];
        }

        Arrays.sort(x);
        Arrays.sort(y);

        long res=Math.max(Math.abs(x[N-1]-x[0]),Math.abs(y[N-1]-y[0]));
        

        
        System.out.println(res);
        }
    }