import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		double a[] = new double[6];
		int n = Integer.parseInt(scan.next());
		for(int i = 0;i < n;i++){
			for(int j = 0;j < 6;j++)a[j] = Double.parseDouble(scan.next());
			double ab = Math.sqrt(Math.pow(a[3] - a[0], 2) + Math.pow(a[4] - a[1], 2));
			double ra = a[2];
			double rb = a[5];
			if(ra + rb < ab){
				System.out.println(0);
			}else if(Math.abs(ra - rb) > ab && ra > rb){
				System.out.println(2);
			}else if(Math.abs(ra - rb) > ab && ra < rb){
				System.out.println(-2);
			}else{
				System.out.println(1);
			}
		}
		System.exit(0);
	}

}