
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader bf = null;
		bf = new BufferedReader(new InputStreamReader(System.in));
		int ans = 10000,temp = 0;
		String s,t;
		String str;
		str = bf.readLine();
		s = str;
		str = bf.readLine();
		t = str;
		for(int i = 0;i < s.length()-t.length()+1;++i) {
			temp = 0;
			for(int j = 0;j < t.length();++j) {
				if(!s.substring(i+j, i+j+1).equals(t.substring(j, j+1))) {
					temp++;
				}
			}
			if(ans > temp) {
				ans = temp;
			}
		}
		System.out.println(ans);
	}
}