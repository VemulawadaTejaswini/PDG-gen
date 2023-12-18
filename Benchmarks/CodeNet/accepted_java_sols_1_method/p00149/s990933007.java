import java.util.Scanner;
//import java.util.Arrays;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		double r[] = new double[40];
		double l[] = new double[40];
		int a[] = new int[2];
		int b[] = new int[2];
		int c[] = new int[2];
		int d[] = new int[2];
		
		int i = 0;
		while(scan.hasNext()){
			r[i] = scan.nextDouble();
			l[i] = scan.nextDouble();
			if(r[i] >= 1.1){
				++a[0];
			}else if(r[i] >= 0.6){
				++b[0];
			}else if(r[i] >= 0.2){
				++c[0];
			}else{
				++d[0];
			}
			if(l[i] >= 1.1){
				++a[1];
			}else if(l[i] >= 0.6){
				++b[1];
			}else if(l[i] >= 0.2){
				++c[1];
			}else{
				++d[1];
			}
			i++;
		}
		System.out.println(a[0] + " " + a[1]);
		System.out.println(b[0] + " " + b[1]);
		System.out.println(c[0] + " " + c[1]);
		System.out.println(d[0] + " " + d[1]);
	}
}