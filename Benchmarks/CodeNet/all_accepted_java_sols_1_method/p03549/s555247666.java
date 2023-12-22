import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scan = new Scanner(System.in);
				int n = scan.nextInt();
			
				int m = scan.nextInt();
				
				int sum = 0;
				
				sum+=1900*m+(n-m)*100;
				for(int i=0;i<m;i++)
				    sum*=2;

				
				
				System.out.println(sum);
	}

}
