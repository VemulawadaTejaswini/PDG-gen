import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(",");
			
			String ID = tmpArray[0];
			double weigh = Double.parseDouble(tmpArray[1]);
			double height = Double.parseDouble(tmpArray[2]);
			
			if(BMI(weigh, height) >= 25){
				System.out.println(ID);
			}
		}
	}
	
	static double BMI(double w, double h){
		return w/h/h;
	}

}