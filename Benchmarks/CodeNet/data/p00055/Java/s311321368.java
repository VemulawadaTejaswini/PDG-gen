import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(cin.hasNext()){
			double[] a = new double[11];
			a[1]=cin.nextDouble();
			double sum = 0;
			sum = a[1];
			for(int i = 2; i < 11; i++){
				if(i%2==0){
					a[i]=a[i-1]*2;
				}
				else{
					a[i]=a[i-1]/3.0;
				}
				sum += a[i];
			}
			System.out.println(sum);
		}
	}

}