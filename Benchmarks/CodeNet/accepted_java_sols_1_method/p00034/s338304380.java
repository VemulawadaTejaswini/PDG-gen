import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double v1, v2;
		int d;
		double t;
		String[] s;
		int[] a;
		int sum;
		
		while(scan.hasNext()){
			s = scan.next().split(",");
			a = new int[11];
			sum = 0;
			
			for(int i = 0; i < 10; i++){
				a[i]=Integer.parseInt(s[i]);
				sum += a[i];
			}
			
			v1 = Double.parseDouble(s[10]);
			v2 = Double.parseDouble(s[11]);
			d = 0;
			
			for(int i = 0; i < 10; i++){
				d += a[i];
				t = d / v1;
				if(d + t*v2 >= sum){
					System.out.println( i + 1);
					break;
				}
			}
		}
	}
}