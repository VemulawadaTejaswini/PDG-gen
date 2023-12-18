import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line = bf.readLine()) != null) {
			char[] c = line.toCharArray();
			if(c.length<=0)break;
			for(int i=0;i<c.length;i++)c[i] -= '0';
			for(int i=c.length-1;i>=0;i--)for(int j=0;j<i;j++)c[j] = (char)((c[j]+c[j+1])%10);
			System.out.println((int)c[0]);
		}
	}
}