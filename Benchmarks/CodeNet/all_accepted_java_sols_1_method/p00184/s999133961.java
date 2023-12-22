import java.util.Scanner;


public class Main {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			int[] ps = new int[7];
			for(int j = 0; j < n; j++){	
				int s = sc.nextInt();
				
				if(s >= 60){
					ps[6]++;
				}else{
					ps[s/10]++;
				}
			}
			
			for(int i : ps){
				System.out.println(i);
			}
			
			
		}
		
		
		
	}
	
	
}