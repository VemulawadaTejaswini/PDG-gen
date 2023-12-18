import java.util.Scanner;
public class sampledMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int i=1;
		
		while(i<=a){
			int b = i;
				if(b%3==0){
					System.out.print(" bは"+i);//" aは"
				}
			
				else {
					while(b>0){
						if (b % 10 == 3) {
						System.out.print(" x"+i+"x ");					    	
					        break;
					}
					    b /= 10;
				}
					}
				 i++;
				}
	


		System.out.println("");
		
	}
}
