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
			String out = ans;
			if(n == i){
				out += i;
				System.out.println(out);
			}else{
				int newlimit = Math.min(n-i, i);
				out += i+" ";
				run(n-i,newlimit,out);
			}
		}
	}
}