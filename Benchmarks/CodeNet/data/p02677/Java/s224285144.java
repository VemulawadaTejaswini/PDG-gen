import java.text.DecimalFormat;
import java.util.*;
import java.io.*;
public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	int[] list = Arrays.stream(reader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	int A = list[0];
	int B =list[1];
	int H = list[2];
	int M = list[3];
	double deg_min = M * (Math.PI/30.0);
       	double deg_hrs = (H + (M/60.0))*(Math.PI/6.00);	
	double angle = Math.abs(deg_min-deg_hrs);
	double result = Math.sqrt(A*A + B*B -  2*A*B*Math.cos(angle));
	DecimalFormat dec = new DecimalFormat("#0.000000000");
	System.out.println(dec.format(result));
	}
}
