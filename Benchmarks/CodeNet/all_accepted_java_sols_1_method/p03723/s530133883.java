import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner kbscanner = new Scanner(System.in);
		int a = kbscanner.nextInt();
		int b = kbscanner.nextInt();
		int c = kbscanner.nextInt();
		
		kbscanner.close();
		
		int nextA, nextB, nextC;
		nextA = nextB = nextC = 0;
		
		int times = 0;
		
		while(true){
			nextB += a / 2;
			nextC += a / 2;
			
			nextC += b / 2;
			nextA += b / 2;
			
			nextA += c / 2;
			nextB += c / 2;
			
			if(a % 2 != 0 || b % 2 != 0 || c % 2 != 0){
				break;
			}
			else if(nextA == nextB && nextB == nextC){
				times = -1;
				break;
			}
			
			a = nextA;
			b = nextB;
			c = nextC;
			
			nextA = nextB = nextC = 0;
			
			times++;
			
		}
		
		System.out.print(times);

	}

}