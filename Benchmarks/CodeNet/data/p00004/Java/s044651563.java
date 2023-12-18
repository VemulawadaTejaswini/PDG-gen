import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0004_SimultaneousEquation {
public class Main {
	public static void main(String[] args) {
		try {
			Problem0004_SimultaneousEquation test = new Problem0004_SimultaneousEquation();
		//	Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				try {
					String[] textArray = line.split(" ");
					double[] numbers = new double[6];
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
	void showAnswer(double[] array) {
		checkLength(array);
		
		double x = getX(array);
		double y = getY(array);
		
		
		System.out.printf("%.3f %.3f%n", x, y);
	}
	double getX(double[] array) {
		checkLength(array);
		
		double x = (array[2]*array[4] - array[1]*array[5]) / (array[0]*array[4] - array[3]*array[1]);
		x = round(x);
		
		return x;
	}
	double getY(double[] array) {
		checkLength(array);
		
		double y = (array[2]*array[3] - array[0]*array[5]) / (array[1]*array[3] - array[0]*array[4]);
		y = round(y);
		
		return y;
	}
	private double round(double number) {
		int large = (int)(number * 10000);
		int small = (int)(number * 1000) * 10;
		double result;
		
		if(large - small < 5) {	//ツ静伉づィツ可コツつー
			result = small;
		} else {	//ツ静伉づィツ湘」ツつー
			result = small + 10;
		}
		result = result/10000;
		return result;
	}
	private void checkLength(double[] array) {
		if(array.length != 6) {
			throw new IllegalArgumentException();
		}
	}
}