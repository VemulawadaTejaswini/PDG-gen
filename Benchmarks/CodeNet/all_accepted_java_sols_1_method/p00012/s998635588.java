
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException,
			IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		StringBuilder builder = new StringBuilder();
		StringTokenizer tokenizer;
		String s;
		while((s=reader.readLine())!=null){
			Path2D.Double sank = new Path2D.Double();
			tokenizer = new StringTokenizer(s);
			double[] z = new double[8];
			for(int i=0;i<8;i++){
				z[i] = Double.parseDouble(tokenizer.nextToken());
			}
			sank.moveTo(z[0], z[1]);
			sank.lineTo(z[2], z[3]);
			sank.lineTo(z[4], z[5]);
			
			Point2D.Double pt = new Point2D.Double(z[6], z[7]);
			System.out.println(sank.contains(pt)?"YES":"NO");
		}
	}

}