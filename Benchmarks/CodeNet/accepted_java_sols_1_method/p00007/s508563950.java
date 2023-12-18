import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double debt=100000;
		for(int i=0;i<n;i++){
			debt=debt+debt*0.05;
			debt=Math.ceil(debt/1000)*1000;
		}
		System.out.println((int)debt);
	}
}