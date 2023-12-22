import java.text.DecimalFormat;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double output = 0;
		double addition = 0;
		for(int i = 0;i<N;i++) {
			double under = 1/sc.nextDouble();
			addition += under;
		}
		output = 1/addition;
		System.out.println(output);
		
	}

}
