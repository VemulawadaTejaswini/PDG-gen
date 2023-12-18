import java.io.*;
public class Main {
	static int hoge[]=new int[30];
	private static void solve(int depth,int i){
		int j;
		if(i==0){
			depth--;
			for(j=0;j<depth;j++)
				if(hoge[j]<hoge[j+1])
					return ;
			for(j=0;j<depth;j++){
				System.out.print(hoge[j]+" ");
			}
			System.out.println(hoge[j]);
			return ;
		}
		for(j=i;j>0;j--){
			hoge[depth]=j;
			solve(depth+1,i-j);
		}
	}
	public static void main(String args[])throws IOException{
		BufferedReader br=
			new BufferedReader(new InputStreamReader(System.in));
		int n;

		n=Integer.parseInt(br.readLine());
		solve(0,n);
	}
}