import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n;
		int a, b;
		int cardA, cardB;
		
		while(true){
			n = scan.nextInt();
			if(n == 0)break;
			cardA = 0;
			cardB = 0;
			
			
			for(int i = 0; i < n; i++){
				a = scan.nextInt();
				b = scan.nextInt();
				
				if(a > b)cardA += a + b;
				else if(a < b)cardB += a + b;
				else{
					cardA += a;
					cardB += b;
				}
			}
			System.out.println(cardA + " " + cardB);
		}
	}
}