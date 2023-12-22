import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		int N=sc.nextInt();
		String[] s=new String[200];
		int ans_kari=0;
		int ans=0;

		for(int i=0;i<N;i++) s[i]=sc.next();

		int M=sc.nextInt();
		String[] t=new String[M];

		for(int i=0;i<M;i++) s[i+N]=sc.next();

		for(int i=0;i<N;i++)
		{
			for(int j=0;j<N+M;j++){
				if(s[i].equals(s[j]) && j<N) ans_kari++;
				else if(s[i].equals(s[j]) && j>=N) ans_kari--;
			}
			if(ans<ans_kari) ans=ans_kari;
			ans_kari=0;
		}

		System.out.println(ans);

	}
}