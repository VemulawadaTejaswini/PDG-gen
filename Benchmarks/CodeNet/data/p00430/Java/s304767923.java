import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line[] = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			if(n==0){break;}

			run(n,n,"");
		}
	}

	static void run(int n, int limit, String ans){
		for(int i=limit;i>0; i--){
			if(n == i){
				System.out.println(ans+i);
			}else{
				int newlimit = Math.min(n-i, i);
				run(n-i,newlimit,ans+i+" ");
			}
		}
	}
}