import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n  = sc.nextInt();
		int[] x = new int[n];
		
		for(int i =0;i<n;i++) {
			x[i]= sc.nextInt();
		}
		
		long min=1000000000;
		int best=-1;
		for(int j=1;j<101;j++) {
			long sum= 0;
			for(int i=0;i<n;i++) {
				sum+=(j-x[i])*(j-x[i]);
			}
			if(sum<min) {
				min=sum;
			}
		}
		for(int i=0;i<n;i++) {
			long sum= 0;
			
		}

		System.out.println(min);
	}

}
/*
class City{
	int order;
	int prefecture;
	int year;
	int number;
	City(int order,int prefecture, int year){
		this.order = order;
		this.prefecture = prefecture;
		this.year = year;
	}
}
*/
