import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double[] a = new double[10];
			double a1 = sc.nextDouble();
			double s = 0;
			a[0] = a1;
			for(int i = 0; i < 10; i++){
				if(i%2 !=0 && i !=0){
					a[i] = a[i-1] * 2;
				}
				if(i%2==0 && i!=0){
					a[i] = a[i-1] / 3;
				}
				s += a[i];
			}
			System.out.println(s);
		}
	}
}