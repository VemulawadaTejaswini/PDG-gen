import java.util.*;
import java.io.PrintWriter;
import static java.lang.Integer.*;
import static java.lang.Long.*;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Main {
	public static void main(String[] args) {
		int i,j;
		Scanner sc = new Scanner(in);
		int n = parseInt(sc.next());
		int k = parseInt(sc.next());
		double[] p = new double[n];
		for (i = 0; i < n; i++) {
			p[i] = (1.0d + parseInt(sc.next()))/2;
		}
		sc.close();
		double sum = 0.0;
		for (i = 0; i < k; i++) {
			sum +=  p[i];
		}
		double max = sum;
		double tmp = 0.0;
		for (i = 0; i+k < n; i++) {
			sum -= p[i];
			sum += p[i+k];
			tmp = sum;
			if(max<tmp) {
				max = tmp;
			}
		}
		out.println(max);
	}
}
