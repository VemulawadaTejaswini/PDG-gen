import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		int count=0;
		
		for(int i=1;i<=a;i++) {
			for(int k=1;k<=b;k++) {
				
				int x=k%10;
				int y=(k-x)/10;
				
						
				if(x>=2 && y>=2 && x*y==i) {
					count++;
				}	
				
			}
			
		}
		
		
		System.out.println(count);
		


		
		
		

	}

}
