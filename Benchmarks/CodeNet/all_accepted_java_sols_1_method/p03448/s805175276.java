import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated m ethod stub
		Scanner sc = new Scanner(System.in); 
		
		int A = sc.nextInt(); // 500
		int B = sc.nextInt(); // 100
		int C = sc.nextInt(); // 50
		int X = sc.nextInt();
		
		int total_a = 0;
		int total_b = 0;
		int total_c = 0;
		int count = 0;
		for(int a=0; a<=A; a++) {
			total_a = a*500;
			if(total_a > X)break;
			
			for(int b=0; b<=B; b++) {
				total_b = total_a + b*100;
				if(total_b > X)break;
				
				for(int c=0; c<=C; c++) {
					total_c = total_b + c*50;
					//System.out.println("["+a+","+b+","+c+"]"+total_c);
					
					if(total_c == X) {
						count++;
					}else if(total_c > X) {
						break;
					}
					
				}
			}
		}
		System.out.println(count);
	}

} 