import java.util.ArrayList;
import java.util.Scanner;
 
class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> d = new ArrayList<Double>();
		while(sc.hasNextDouble()){
			d.add(sc.nextDouble());
		}
		double a = d.get(d.size()-1);
		double b = d.get(d.size()-1);
		for(int i = 0; i < d.size()-1; i++){
			if(a < d.get(i))a = d.get(i);
			if(b > d.get(i))b = d.get(i);
			System.out.println(a-b);
		}
	}
}