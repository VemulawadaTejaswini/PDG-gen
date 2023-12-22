import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		char c;
		char cc;
		int sum[] = new int[26];
		try {
			while((str=br.readLine()) !=null){
				for(int i=0;i<str.length();i++){
					c=str.toLowerCase().charAt(i);
					cc='a';
					for(int j=0 ; j<sum.length;j++){
						if(c==cc){
							sum[j]++;
						}
						cc++;
					}
				}
			}
			cc='a';
			for(int i = 0 ; i < sum.length;i++){
				System.out.println(cc+" : "+sum[i]);
				cc++;
			}
		} catch (Exception e) {
			System.err.println(e);
		}
	}

}