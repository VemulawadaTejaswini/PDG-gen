import java.util.*;
public class Main{
 
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int C=sc.nextInt();
		int K=sc.nextInt();
		int[] T=new int[N];
		for(int i=0;i<N;i++){
		T[i]=sc.nextInt();
		}
		Arrays.sort(T);
		
		int wait=1;
		int waitTime=T[0];
		int result=1;
		for(int i=1;i<N;i++){
			if(wait==C||T[i]-waitTime>K){
				result++;
				wait=0;
				waitTime=T[i];
			}
			wait++;
		}
		System.out.println(result);

	}
 
}
