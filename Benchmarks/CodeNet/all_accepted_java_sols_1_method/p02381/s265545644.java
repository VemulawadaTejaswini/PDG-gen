import java.util.*;

public class Main{
	public static void main(String[] args){

		List<Double> listAl = new ArrayList<Double>();
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		while(n != 0){
			double[] sc = new double[(int) n];
			double sum = 0;
			for(int i = 0; i < n; i++){
				double s = scan.nextDouble();
				sc[i] = s;
				sum += s;
			}
			double m = sum / n;
			double a = 0;
			for(int i = 0; i < n; i++){
				a += Math.pow((sc[i] - m), 2);
			}
			double al = Math.sqrt(a / n);
			listAl.add(al);
			n = scan.nextDouble();
		}

		for(double a : listAl){
			System.out.println(a);
		}
	}
}