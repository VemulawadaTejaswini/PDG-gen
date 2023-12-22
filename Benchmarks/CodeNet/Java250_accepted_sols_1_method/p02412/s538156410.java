import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		int i, j, m;
		
		while(true){
			int n = scan.nextInt();
			int x = scan.nextInt();
			int count=0;
			
			if(n==0 && x==0) break;
			
			for(i=1; i<=n; i++){
				for(j=i+1; j<=n; j++){
					for(m=j+1; m<=n; m++){
						if(i + j + m == x){
							count++;
						}
					}
				}
			}
			
			System.out.println(count);
		}
	}
}