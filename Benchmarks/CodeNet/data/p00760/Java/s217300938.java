import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()){
			int n = sc.nextInt();
			
			int y, m, d, sum;
			for(int i=0;i<n;i++){
				sum = 0;
				y = sc.nextInt();
				m = sc.nextInt();
				d = sc.nextInt();
				
				sum += ((y-1)/3)*590;
				if(y%3==2)sum += 195;
				if(y%3==0)sum += 390;
				
				for(int j=1;j<m;j++){
					if(y%3!=0 && j%2==0)sum+=19;
					else sum+=20;
				}
				
				sum+=d;
				
				System.out.println(196471-sum);
			}
		}
	
	}	
}