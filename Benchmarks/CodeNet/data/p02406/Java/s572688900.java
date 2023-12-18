import java.util.Scanner;
public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int i = 1;
		int x = i;
		
		for(x=i;i<=n;i++){
			x = i;
			if(x%3 == 0){
				System.out.print(" "+i);
				continue;
			}
			if(x%10 == 3){
				System.out.print(" "+i);
				continue;
			}
			x /= 10;
			while(x != 0){
				if(x%10 == 3){
					System.out.print(" "+i);
					break;
				}else {
					x /= 10;
					continue;
				}
				
			}
			
			
		}
		System.out.printf("\n");
		sc.close();
	}
	

}