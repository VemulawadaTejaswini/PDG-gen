import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long [] A = new long [N];
        for(int i=0;i<N;i++){A[i] = sc.nextLong();}
        Arrays.sort(A);
		long ans = 1;
        String str = "1000000000000000000";
        long limit = Long.parseLong(str);
        for(int i=0;i<N;i++){
          if(A[i]==0){ans=0;break;}
          if(A[i]<=limit/ans){ans*=A[i];}
          else{ans=-1;break;}
        }
		System.out.println(ans);
	}
}