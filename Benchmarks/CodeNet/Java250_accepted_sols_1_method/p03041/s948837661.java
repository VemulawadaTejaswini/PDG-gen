import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {

		String[] in=br.readLine().split(" ");
		int len=Integer.parseInt(in[0]);
		int order=Integer.parseInt(in[1]);

		String[] str = br.readLine().split("");
		String[] result = new String[len];

		for(int i=0; i<len; i++) {
			if(i==order-1) {
				result[i]=str[i].toLowerCase();
			}else {
				result[i]=str[i];
			}
		}
		String re = "";
		for(String s:result) {
			re=re+s;
		}
		System.out.println(re);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
