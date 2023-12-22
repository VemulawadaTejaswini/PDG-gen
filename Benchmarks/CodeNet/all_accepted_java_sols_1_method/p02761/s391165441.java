import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int S[]=new int[N];
		boolean key[]=new boolean[N];
		String ans="";
		for(int i=0;i<M;i++){
			int s=stdIn.nextInt()-1;
			int c=stdIn.nextInt();
			if(s==0&&c==0&&N>1){
				System.out.println(-1);
				System.exit(0);
			}
			if(key[s]&&S[s]!=c){
				System.out.println(-1);
				System.exit(0);
			}
			else{
				key[s]=true;
				S[s]=c;
			}
		}
		for(int i=0;i<N;i++){
			if(i==0&&S[i]==0&&key[i]==false&&N!=1){
				S[i]=1;
			}
			ans+=String.valueOf(S[i]);
		}
		System.out.println(ans);
	}
}
