import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		
		ArrayList<Integer> list=new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			int c=sc.nextInt();
			list.add(c);
		}
		int c=0,total=0;
		for(int i=0;i<n;i++) {
	
			total=total+list.get(i);
		}

		
		double limit=(double)1/(4*m)*(double)total;
		for(int i=0;i<n;i++) {
			if(list.get(i)>=limit) {
				
		//	System.out.println(limit);
				c++;
				
			}
			
		}
		if(c>=m) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		
		
	}
}
