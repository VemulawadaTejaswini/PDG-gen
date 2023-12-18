import java.util.Scanner;

class Main{
	public static void main( String[] args ) {
		try(Scanner sc = new Scanner(System.in)){
			int n = sc.nextInt();
			while(n != 0) {
				double[] data = new double[n];
				double sum = 0;
				double vars = 0;
				for(int i = 0;i <n;i++) {
					int num = sc.nextInt();
					data[i] =  num;
					sum += data[i];
				}
				double ave = ( (double)sum )/data.length;
				for (int i=0; i<data.length; i++) {
					vars += ((data[i] - ave)*(data[i] - ave));
				}
				double std = Math.sqrt(vars/data.length);
				System.out.println(std);
				n = sc.nextInt();
			}
		}
	}
}
