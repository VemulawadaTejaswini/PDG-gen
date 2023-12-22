import java.io.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("(-?[0-9]+) *(-?[0-9]+) *(-?[0-9]+) *(-?[0-9]+) *(-?[0-9]+) *(-?[0-9]+)");
		String str = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while((str=bf.readLine())!=null){
			Matcher matcher = pattern.matcher(str);
			if(!matcher.matches())break;
			int h[] = new int[6];
			for(int i=0;i<6;i++)h[i]=Integer.parseInt(matcher.group(i+1));
			int xc=h[2]*h[4]-h[1]*h[5];
			int xm=h[0]*h[4]-h[1]*h[3];
			int yc=h[2]*h[3]-h[0]*h[5];
			int ym=h[1]*h[3]-h[0]*h[4];
			System.out.printf("%.3f %.3f\n",
				(xc==0)?(double)0:(double)xc/xm,
				(yc==0)?(double)0:(double)yc/ym
			);
		}
	}
}