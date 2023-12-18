import java.io.*;
public class Main {
	public static void main(String... args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
		double x[] = new double[20];
		double y[] = new double[20];
		int i = 0;
		while ((line = br.readLine() ) != null){
			String numbers[] = line.split(",");
			x[i] = Double.parseDouble(numbers[0])-x[0];
			y[i] = Double.parseDouble(numbers[1])-y[0];
			i++;
		}
		double area = 0;
		for (int k = 1; k<i; k++){
			area += x[k]*y[k+1]-x[k+1]*y[k];
		}
		System.out.println(Math.abs(area*0.5));
	}
}