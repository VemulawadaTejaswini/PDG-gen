import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int A[] = new int [N];
        int n=0;
        int m=-1;
        for(int i=0;i<N;i++)
          A[i] = sc.nextInt();
        Arrays.sort(A);
        for(int i=0;i<N;i++){
          m = -m;
          n = n + A[N-1-i] * m;
//        System.out.println(A[N-1-i] +" " +m);
        }
        System.out.println(n);
      
   
      
	}

}
