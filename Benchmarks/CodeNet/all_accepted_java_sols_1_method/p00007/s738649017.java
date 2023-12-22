
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double debt=100000;
		for(int i=0;i<n;i++){
			debt=1.05*debt;
			if(debt%1000!=0){
				debt=debt-debt%1000+1000;
			}
		}
		System.out.println((int)debt);
		sc.close();
	}
}