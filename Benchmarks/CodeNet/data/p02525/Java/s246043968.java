import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		for(;;){
			int n = sc.nextInt();
			if(n==0){break;}
			int[] data  = new int[n];
			for(int i=0; i<n; i++){
				data[i] = sc.nextInt();
			}
			double mean = MakeMean(data);
			double dev = MakeDeviation(data,mean);
			System.out.println(dev);
		}
	}
	static double MakeMean(int[] data){
		double mean = 0;
		for(int i=0; i<data.length; i++){
			mean += data[i];
		}
		mean /= data.length;
		return mean;
	}
	static double MakeDeviation(int[] data, double mean){
		double dev=0;
		for(int i=0; i<data.length; i++){
			dev += Math.pow((data[i]-mean),2);
		}
		dev = Math.sqrt(dev/data.length);
		return dev;
	}
}