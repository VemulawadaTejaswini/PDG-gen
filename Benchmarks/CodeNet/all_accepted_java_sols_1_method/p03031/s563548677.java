import java.util.Scanner;
public class Main {
	public static void main(String[] args)throws Exception{
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int M=stdIn.nextInt();
		int s[][]=new int[M][N];
		int k[]=new int[M];
		int p[]=new int[M];
		int ans=0;
		for(int i=0;i<M;i++){
			k[i]=stdIn.nextInt();
			for(int j=0;j<k[i];j++){
				s[i][j]=stdIn.nextInt()-1;
			}
		}
		for(int i=0;i<M;i++){
			p[i]=stdIn.nextInt();
		}
		for(int i=0;i<Math.pow(2,N);i++){
			boolean key[]=new boolean[N];
			boolean bool=true;
			for(int j=0;j<N;j++){
				if((1&i>>j)==1)
					key[j]=true;
			}
			for(int j=0;j<M;j++){
				int cout=0;
				for(int l=0;l<k[j];l++){
					if(key[s[j][l]])
						cout++;
				}
				if(cout%2!=p[j]){
					bool=false;
					break;
				}
			}
			if(bool)
				ans++;
		}
		System.out.println(ans);
	}
}
