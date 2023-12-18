import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n,x;
		String str;
		String strs[];
		try {
			while (true) {
			str = br.readLine();
			strs=str.split(" ");
			n=Integer.parseInt(strs[0]);
			x=Integer.parseInt(strs[1]);
			if(n==0&&x==0){
				break;
			}
			int cnt = 0;
			for(int i=1;i<=n-2;i++){
				for(int j=i+1;j<=n-1;j++){
					for(int k=j+1;k<=n;k++){
						if(i+j+k==x){
							cnt++;
						}
					}
				}
			}
			System.out.println(cnt);
		}
		} catch (Exception e) {
			System.err.println( e );
		}
		

	}

}