import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] x=new long[N];
        long[] y=new long[N];
        long[] x2=new long[N];
        long[] y2=new long[N];
        for(int i=0; i<N; i++){
            x[i]=sc.nextLong();
            y[i]=sc.nextLong();
            x2[i]=x[i]+y[i];
            y2[i]=x[i]-y[i];
        }


        Arrays.sort(x2);
        Arrays.sort(y2);

        long res = Math.max(Math.abs(x2[N-1]-x2[0]),Math.abs(y2[N-1]-y2[0]));




        
        
        System.out.println(res);
        
        }
    }