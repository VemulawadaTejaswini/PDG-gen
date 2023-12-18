import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int i;
		int num[];
num = new int[a];
		int min=0, big=0, sum=0;
		
		for(i=0; i<a; i++){
			int b = scan.nextInt();
			
			num[i] = b;
			if(i == 0){
				min = b;
				big = b;
			}
			if(min>b){
				min = b;
			}
			if(big<b){
				big = b;
			}
			sum += b;
		}
		
		System.out.println(min+" "+big+" "+sum);	
	}
}