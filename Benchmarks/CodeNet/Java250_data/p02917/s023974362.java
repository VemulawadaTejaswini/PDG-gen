import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
		Long[] A = new Long[N];
		Long first = sc.nextLong();
		A[0] = first;
		A[1] = first;
		Long second = 0L;
		for(int i=1;i<N-1;i++){
			second = sc.nextLong();
			if(A[i] > second){A[i]=second;}
			A[i+1] = second;
		}
		A[N-1] = (N==2)?first:second;
		Long Ans =0L;
		for(int i=0;i<N;i++){
			Ans += A[i];
		}
		System.out.println(Ans);
		sc.close();
	}
}