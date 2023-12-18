import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.io.BufferedReader;
import java.math.BigInteger;
import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new aoj0112().doIt();
	}
	class aoj0112{
		long waitsum(int a[]){
			long result = 0;
			long sum = 0;
			for(int i = 0;i < a.length;i++){
				result = result + sum;
				sum = sum + a[i];
			}
			return result;
		}
		void doIt() {
			while(true){
				int n = sc.nextInt();
				int a[] = new int [n];
				if(n == 0)break;
				for(int i = 0;i < n;i++)a[i] = sc.nextInt();
				Arrays.sort(a);
				System.out.println(waitsum(a));
			}
		}
	}
}