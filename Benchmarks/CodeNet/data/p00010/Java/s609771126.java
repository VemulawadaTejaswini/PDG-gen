import java.io.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		Pattern pattern = Pattern.compile("(-?[0-9.]+) *(-?[0-9.]+) *(-?[0-9.]+) *(-?[0-9.]+) *(-?[0-9.]+) *(-?[0-9.]+)");
		String str;
		while((str = bf.readLine())!=null){
			Matcher matcher = pattern.matcher(str);
			double[][] n = new double[4][3];
			if(!matcher.matches())break;
			n[0][0]=Double.parseDouble(matcher.group(1));n[1][0]=Double.parseDouble(matcher.group(3));n[2][0]=Double.parseDouble(matcher.group(5));
			n[0][1]=Double.parseDouble(matcher.group(2));n[1][1]=Double.parseDouble(matcher.group(4));n[3][1]=Double.parseDouble(matcher.group(6));
			for(int i=0;i<3;i++)n[i][2]=-(n[i][0]*n[i][0]+n[i][1]*n[i][1]);
			for(int i=0;i<2;i++)for(int j=0;j<3;j++)n[i][j]-=n[2][j];
			n[3][0]=(n[0][2]*n[1][1]-n[0][1]*n[1][2])/(((n[0][0]*n[1][1]-n[0][1]*n[1][0])==0)?(1):(n[0][0]*n[1][1]-n[0][1]*n[1][0]));
			n[3][1]=(n[0][2]*n[1][0]-n[0][0]*n[1][2])/(((n[0][1]*n[1][0]-n[0][0]*n[1][1])==0)?(1):(n[0][1]*n[1][0]-n[0][0]*n[1][1]));
			n[3][2]=n[2][2]-n[3][0]*n[2][0]-n[3][1]*n[2][1];
			n[3][0]/=(-2);n[3][1]/=(-2);
			n[3][2]=Math.sqrt(n[3][0]*n[3][0]+n[3][1]*n[3][1]-n[3][2]);
			System.out.printf("%.3f %.3f %.3f\n",n[3][0],n[3][1],n[3][2]);
		}
	}
}