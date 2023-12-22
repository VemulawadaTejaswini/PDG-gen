import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			double k[] = new double[2];
			String a = scan.next();
			String[] f = a.split(",", 0);
			k[0] = Double.parseDouble(f[1]);
			k[1] = Double.parseDouble(f[2]);
			if(k[0] / (k[1]*k[1]) >= 25){
				System.out.println(f[0]);
			}
		}
	}
}