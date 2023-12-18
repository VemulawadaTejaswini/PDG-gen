import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			int w=Integer.parseInt(br.readLine());
			int n=Integer.parseInt(br.readLine());
			int rep;
			int[] line=new int[w+1];
			for(int i=1;i<=w;i++){	//line[]に1〜wを代入
				line[i]=i;
			}
			int a,b;
			String[] str=new String[2];
			for(int i=0;i<n;i++){
				str=br.readLine().split(",");
				a=Integer.parseInt(str[0]);
				b=Integer.parseInt(str[1]);
				rep=line[a];	//line[a]とline[b]を入換
				line[a]=line[b];
				line[b]=rep;
			}
			for(int i=1;i<=w;i++){
				System.out.println(line[i]);
			}
		}catch(Exception e){
		}
	}
}