import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	static void aryExchng(double[] a,double[] b){
		for(int i=0; i < ((a.length > b.length) ? b.length:a.length); i++){
			double t = a[i];
			a[i] = b[i];
			b[i] = t;
		}
	}

	static double minOf(double[] a){
		double m = a[0];
		for(double i:a)
			if(m > i) m = i;
		return m;		
	}
	
	static double maxOf(double[] a){
		double m = a[0];
		for(double i:a)
			if(m < i) m = i;
		return m;		
	}
	
	
	public static void main(String[] args) {
		double[] read = new double[10000];
		int i = 0;
		while(sc.hasNext()) read[i++] = sc.nextDouble();
		double[] data = new double[i];
		aryExchng(read,data);
		System.out.printf("%.1f",maxOf(data)-minOf(data));
	}

}