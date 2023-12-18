import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			final int n = sc.nextInt();
			
			if(n == 0){
				break;
			}
			
			final int y = sc.nextInt();
			
			double max = Double.MIN_VALUE;
			int num = -1;
			
			for(int i = 0; i < n; i++){
				int b = sc.nextInt();
				int r = sc.nextInt();
				int t = sc.nextInt();
				
				double p = 0;
				
				if(t == 1){
					p = (1 + y * (r / 100.0));
				}else{
					p = Math.pow((1 + (r / 100.0)), y);
				}
				
				if(max< p){
					max = p;
					num = b;
				}
			}
			
			System.out.println(num);
			
		}
	}

}