
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line="";
		while((line = br.readLine())!=null){
			String[] s =line.split(" ");
			int[] a = new int[4];
			a[0] = Integer.parseInt(s[0]);
			a[1] = Integer.parseInt(s[1]);
			a[2] = Integer.parseInt(s[2]);
			a[3] = Integer.parseInt(s[3]);
			s = br.readLine().split(" ");
			int[] b = new int[4];
			b[0] = Integer.parseInt(s[0]);
			b[1] = Integer.parseInt(s[1]);
			b[2] = Integer.parseInt(s[2]);
			b[3] = Integer.parseInt(s[3]);
			int hit = 0;
			for(int i = 0;i<4;i++){
				if(a[i] == b[i]){
					hit++;
				}
			}
			int blow = 0;
			for(int i = 0;i<4;i++){
				for(int j = 0; j < 4;j++){
					if(a[i] == b[j] && i != j){
						blow++;
					}
				}
			}
			System.out.println(hit+" "+blow);
		}
	}

}