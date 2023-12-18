import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int N =scan.nextInt();
		Double a;
		double c=0;
		List<Double> b=new ArrayList<Double>();
		for(int count=0;count<N;count++){
			a=(double) scan.nextInt();
			b.add(1/a);
		}
		scan.close();
		for(int count=0;count<b.size();count++){
			c=b.get(count)+c;
		}
		System.out.println(1/c);
	}
}
