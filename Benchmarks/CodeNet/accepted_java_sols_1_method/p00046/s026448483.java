import java.util.Scanner;
public class Main {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double max = 0.0;
		double min = 0.0;
		int count = 0;
		while(sc.hasNext()){
			double high = sc.nextDouble();
			if(count == 0){
				max = high;
				min = high;
			}
			if(high > max) max = high;
			if(high < min) min = high;
			count++;
		}
		System.out.println(max - min);
		sc.close();
	}

}