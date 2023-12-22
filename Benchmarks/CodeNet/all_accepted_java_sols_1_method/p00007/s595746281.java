import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		double dept = 100000;
		int keta = 1000;
		
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		
		for(int i=0;i<k;i++){
			dept = dept * 1.05;
			dept = dept / keta;
			dept = keta* (Math.ceil(dept));
		}
		System.out.println((int)dept);
	}
	
}