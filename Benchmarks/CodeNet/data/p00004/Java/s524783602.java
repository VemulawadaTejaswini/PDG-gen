import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String[] args){
		Scanner sc  = new Scanner(System.in);
		
		while(sc.hasNextLine()){
			double preX,preY;
			String[] s = sc.nextLine().split("[\\s]+");
			double[] data = new double[s.length];
			for(int i=0;i<s.length;i++){
				data[i] = Double.parseDouble(s[i]);
			}
			
			preX = (((data[2]*data[4])-(data[1]*data[5])) / ((data[0]*data[4])-(data[1]*data[3])));
			preY = (((data[0]*data[5])-(data[2]*data[3])) / ((data[0]*data[4])-(data[1]*data[3])));
			
			
			NumberFormat nf = NumberFormat.getInstance();
			nf.setMaximumFractionDigits(3);
			
			System.out.println(nf.format(preX)+" "+nf.format(preY));
		}
	}
}