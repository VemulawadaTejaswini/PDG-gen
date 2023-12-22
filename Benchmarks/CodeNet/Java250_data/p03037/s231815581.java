import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] L = new int[M];
        int[] R = new int[M];
        int max=N+1;
        int min=0;
        for(int i=0; i<M; i++){
            L[i]=sc.nextInt();
            R[i]=sc.nextInt();
            min = Math.max(min,L[i]);
            max = Math.min(max,R[i]);
        }
        //int K = sc.nextInt();
        //long N = sc.nextLong();
        int res = Math.max(max-min+1,0);
        

        
        System.out.println(res);
        }
    }