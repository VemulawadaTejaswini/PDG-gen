import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));
		String line;
		double x,y;
		while((line=d.readLine())!=null){
			String sp[] = line.split(" ");
			double[] var=new double[6];
			for(int i=0;i<sp.length;i++){
				var[i]=Double.valueOf(sp[i]);
			}
//[0]x + [1]y = [2]
//[3]x + [4]y = [5]
			var[1]/=var[0];// b/a
			var[2]/=var[0];// c/a
			var[0]=1;// a/a


			var[1]*=-1;

			//x=-by+c;
			//x=[1]y+[2];

			var[4]+=(var[3]*var[1]);
			var[5]-=(var[3]*var[2]);
			//[3]([1]y+[2])+[4]y=[5]
			//([4]+[3][1])y=[5]-[3][2]
			//[4]y=[5];

			y=var[5]/var[4];
			x=var[1]*y+var[2];
			System.out.println( String.format("%.3f", x)+" "+ String.format("%.3f", y));
		}
	}
}