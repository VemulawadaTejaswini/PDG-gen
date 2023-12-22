import java.io.*;
public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] dat = br.readLine().split(" ");
		int r = Integer.parseInt(dat[0]);
		int c = Integer.parseInt(dat[1]);
		StringBuilder out=new StringBuilder();
		int g,p,gg=0;
		String str;
		int[] SumC=new int[c];
		for (int i=0;i<r;i++){
			str =br.readLine();
			dat = str.split(" ");
			g=0;
			for (int j=0;j<c;j++){
				p=Integer.parseInt(dat[j]);
				g += p;
				SumC[j] += p;
			}
			gg+=g;
			out.append(str+" "+g+"\n");
		}
		for (int j=0;j<c;j++) out.append(SumC[j]+" ");
		out.append(gg);
		System.out.println(out);
	}
}