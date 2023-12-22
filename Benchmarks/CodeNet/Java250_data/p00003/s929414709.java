import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++){
			String line = br.readLine();
			String[] str = line.split(" ");
			int[] m = new int[3];
			int max=0;
			for(int j=0;j<3;j++){
				m[j]=Integer.parseInt(str[j]);
				if(m[j]>max)max=m[j];
			}
			int tmp=0;
			for(int j=0;j<3;j++)if(m[j]!=max)tmp+=m[j]*m[j];
			if(max*max==tmp)System.out.println("YES");
			else System.out.println("NO");
		}
	}
}