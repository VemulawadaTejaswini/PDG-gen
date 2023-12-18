import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static final int N_MAX = 1000000;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int N,cnt=0;
		boolean[] a = new boolean[N_MAX];
		for(int i=0;i<N_MAX;i++){
			a[i]=true;
		}
		a[0]=false;
		a[1]=false;
		
		for(int i=2;i<N_MAX;i++){
			if(a[i]==true){
				for(int j=2;i*j<N_MAX;j++){
					a[i*j]=false;
				}
			}
		}
		
		while(str != null){
			N=Integer.parseInt(str);
			
			for(int k=0;k<=N;k++){
				if(a[k]==true){
					cnt++;
				}
			}
			System.out.println(cnt);
			cnt=0;
			str=br.readLine();
		}
		
	}
}