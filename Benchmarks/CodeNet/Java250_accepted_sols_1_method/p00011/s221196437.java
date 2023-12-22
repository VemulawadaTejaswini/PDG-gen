import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int w = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			int hako[] = new int[w+1];
			int dami = 0;
			
			for(int i = 1;i <= w;i++){
				hako[i] = i;
			}
			
			for(int i = 0;i < n;i++){
				String line = br.readLine();
				int a[] = new int[2];
				String s[] = line.split(",",0);
				a[0] = Integer.parseInt(s[0]);
				a[1] = Integer.parseInt(s[1]);
				
				dami = hako[a[0]];
				hako[a[0]] = hako[a[1]];
				hako[a[1]] = dami;
			}
			
			for(int i = 1;i <= w;i++){
				System.out.println(hako[i]);
			}
	}
}