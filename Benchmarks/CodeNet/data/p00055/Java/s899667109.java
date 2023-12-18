public class Main {
	public static void main(String[] args) {
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(in.hasNext()) {
			double[] a = new double[10];
			double sum = a[0] = in.nextDouble();
			for(int i=1; i<10; i++) {
				if(i%2 == 0) {
					a[i] = a[i-1] / 3;
				} else {
					a[i] = a[i-1] * 2;
				}
				sum += a[i];
			}
			System.out.println(sum);
		}
	}
}