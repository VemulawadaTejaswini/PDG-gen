
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double term = sc.nextDouble();
			double sum = 0.0;
			for(int i=0; i < 5; i++){
				sum += term;
				term *= 2;
				sum += term;
				term = term / 3;
			}
			System.out.printf("%1.8f\n",sum);
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}