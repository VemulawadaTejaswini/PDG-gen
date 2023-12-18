import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int num = inputs.nextInt();
		double div = num/3.0;
		double ans = div*div*div;
		System.out.printf("%f\n", ans);
	}

}
