import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arrayy=new double[n];
		String[] arrayb=new String[n];
		double sum=0;
		for(int i=0;i<n;i++) {
			arrayy[i]=sc.nextDouble();
			arrayb[i]=sc.next();
		}
		for(int i=0;i<n;i++) {
			if(arrayb[i].equals("JPY")) {
				sum+=arrayy[i];
			}else {
				sum+=arrayy[i]*380000.0;
			}
		}

		System.out.println(sum);
	}
}

//Arrays.sort(array, (a, b) -> Integer.compare(a[0], b[0]));


