
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in), 1);
		for(String line=br.readLine(); line!=null; line=br.readLine()) {
			if(line.length()==0)
				break;
			double[][] coefficient=new double[2][3];
			for(int i=0; i<coefficient.length; i++)
				coefficient[i]=new double[3];
			String[] array=line.split(" ");
			for(int i=0; i<6; i++) {
				coefficient[i/3][i%3]=Double.parseDouble(array[i]);
			}
			// sweep
			for(int i=0; i<2; i++) {
				for(int j=3-1; j>=i; j--) {
					coefficient[i][j]/=coefficient[i][i];
				}
				for(int j=0; j<2; j++) {
					if(i==j) continue;
					for(int k=3-1; k>=i; k--) {
						coefficient[j][k]-=coefficient[i][k]*coefficient[j][i];
					}
				}
			}
			BigDecimal[] ansBG=new BigDecimal[2];
			double[] ans=new double[2];
			for(int i=0; i<2; i++) {
				ansBG[i]=new BigDecimal(String.valueOf(coefficient[i][2]));
				ans[i]=ansBG[i].setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
			}
			String str=String.format("%.3f %.3f", ans[0], ans[1]);
			System.out.println(str);
		}
	}

}