import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0012_APointInaTriangle {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0012_APointInaTriangle test = new Problem0012_APointInaTriangle();
			Main test = new Main();
			
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line;
			while((line = reader.readLine()) != null) {
				try {
					String[] textArray = line.split(" ");
					double[] numbers = new double[textArray.length];
					
					for(int i = 0; i < textArray.length; i++) {
						numbers[i] = Double.parseDouble(textArray[i]);
					}
					test.showAnswer(numbers);
				} catch(NumberFormatException e) {
					break;
				}
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	//s() + t() = () (0<= s+t <= 1) ðzè(½¾µA()Í_Ì·Ùð\·xNg)
	void showAnswer(double[] array) {
		double[][] vector = getVector(array, 0, 2, 4);
		double[] position = {array[6] - array[0], array[7] - array[1]};
		if(vector[0][0] * vector[1][1] - vector[0][1] * vector[1][0] == 0) {
			vector = getVector(array, 2, 4, 0);
			position[0] = array[6] - array[2];
			position[1] = array[7] - array[3];
		}
		
	//	System.out.println("00:" + vector[0][0] + "\t01:" + vector[0][1]  + "\t10:" + vector[1][0] + "\t11:" + vector[1][1] + "\tA:" + position[0] + "\tB:" + position[1]);
		double s = (position[0] * vector[1][1] - position[1] * vector[1][0]) / (vector[0][0] * vector[1][1] - vector[0][1] * vector[1][0]);
	//	System.out.println("s:" + s);
		double t;
		if(vector[1][0] != 0) {
			t = (position[0] - vector[0][0] * s) / vector[1][0];
		} else if(vector[1][1] != 0) {	//¼û[Ì¯ê_  è¾È¢
			t = (position[1] - vector[0][1] * s) / vector[1][1];
		} else {
			System.out.println("NO");
			return;
		}
	//	System.out.println("t:" + t); 
		if(0 < s && 0 < t && s + t < 1) {	//1or0 Ì Ó¨æÑ¸_  è¾È¢
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
	double[][] getVector(double[] array, int origin, int first, int second) {
		double[][] result = new double[2][2];
		
		for(int i = 0; i < 2; i++) {
			result[0][i] = array[first + i] - array[origin + i];
			result[1][i] = array[second + i] - array[origin + i];
		}
		
		return result;
	}
}