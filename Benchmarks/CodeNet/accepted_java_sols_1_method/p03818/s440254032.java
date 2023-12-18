import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int A[]=new int[100005];
		int ans=N;
		int max=0;
		int sec=0;
		for(int i=0;i<N;i++){
			int a=stdIn.nextInt()-1;
			A[a]++;
			if(a+1>max)
				max=a+1;
		}
		for(int i=0;i<max;i++){
			if(A[i]==2)
				sec++;
			else
				if(A[i]>2){
					if(A[i]%2==0){
						ans-=A[i]-2;
						sec++;
					}
					else
						ans-=A[i]-1;
				}
		}
		if(sec%2==0)
			ans-=sec;
		else{
			ans-=sec;
			ans--;
		}
		System.out.println(ans);
	}
}
