
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[]point = br.readLine().split(" ");
		double length01 = Double.parseDouble(point[0]);
		double length02 = Double.parseDouble(point[1]);
		double angle = Double.parseDouble(point[2]);		
		double length03 = Math.sqrt((length01 * length01) + (length02 * length02));
		
		double sumLength = length01 + length02 + length03;
		double area = (length01 * length02) /2;
		System.out.println(area + "\n" + sumLength + "\n" + length02);
	}
}