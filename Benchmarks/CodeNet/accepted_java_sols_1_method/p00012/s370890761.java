import java.awt.Point;
import java.awt.Polygon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String tmpStr = br.readLine();

			if(tmpStr == null){
				break;
			}

			String[] tmpArray = tmpStr.split(" ");
			int[] input = new int[8];
			//??\?????¨
			for(int i = 0; i < 8; i++){
				input[i] = (int)(Double.parseDouble(tmpArray[i])*1000);
			}

			int[] x = {input[0],input[2],input[4]};
			int[] y = {input[1],input[3],input[5]};

			Polygon triangle = new Polygon(x, y, 3);


			if(triangle.contains(new Point(input[6],input[7]))){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}