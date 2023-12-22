import java.util.Scanner; 
public class Main { 
	public static void main(String... args) { 
		Scanner sc = new Scanner(System.in); 
		while(true) { 
			
			int n = sc.nextInt(); 
			int x = sc.nextInt(); 
			
			if(n == 0 && x == 0) break; 
			
			int count = 0;
			
			for(int a=1; a<=n; a++){
				for (int b=a+1; b<=n; b++) {
					for (int c=b+1; c<=n; c++) {
						if (a+b+c == x) {
							count++;
						}
					}
				}
			}
			
			
			
			System.out.println(count); 
		} 
	} 
}
