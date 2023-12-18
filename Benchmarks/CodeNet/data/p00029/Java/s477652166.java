import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader bf  =new BufferedReader(new InputStreamReader(System.in));
		String t;
		int m=0,n=0;
		while((t=bf.readLine())!=null){
			String[] wd = t.split(" ");
			int l=wd.length;
			int[][] p = new int[l][2];
			for(int i=0;i<l;i++){
				p[i][0]=1;p[i][1]=wd[i].length();
			}
			for(int i=0;i<l;i++)for(int j=i+1;j<l;j++)	if(wd[i].equals(wd[j]))p[j][0]++;
			for(int i=0;i<l;i++){
				if(p[n][0]<p[i][0])n=i;
				if(p[m][1]<p[i][1])m=i;
			}
			System.out.println(wd[n]+" "+wd[m]);
		}
	}
}