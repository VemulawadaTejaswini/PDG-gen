import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		try(Scanner sc=new Scanner(System.in)){
			int n=sc.nextInt();
			
			for(int num=0; num<n; num++) {
				int day=0;
				int y=sc.nextInt();
				int m=sc.nextInt();
				int d=sc.nextInt();
				for(int i=y; i<1000; i++) {
					for(int j=m; j<=10; j++) {
						for(int k=d; k<=((i%3==0)? 20:(j%2==0)? 19:20); k++) {
							day++;
						}
						d=1;
					}
					m=1;
				}
				System.out.println(day);
				
			}
			
		}
	}
} 
