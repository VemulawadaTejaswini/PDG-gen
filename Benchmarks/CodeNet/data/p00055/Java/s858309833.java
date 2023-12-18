import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do{
			double a=sc.nextDouble();
			double sum=a;
			
			for(int i=2; i<=10; i++){
				if(i%2==0) a *= 2;
				else a /= 3;
				sum += a;
			}
			System.out.printf("%.8f%n",sum);
		} while(sc.hasNext());
	}

}