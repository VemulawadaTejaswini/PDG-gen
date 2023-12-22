import java.util.*; 
import java.lang.*; 

public class Main{

	static int gcd(int x, int y, int z){
		if(y == 0 && z == 0){
			return x;
		}
		else if(y == 0){
			return gcd(x,z,0);
		}
		else{
			return gcd(y, x%y,z);
		}
	}

	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		int K = scan.nextInt();
		int sum = 0;
		
		for(int a=1; a<=K; a++){
			for(int b=1; b<=K; b++){
				for(int c=1; c<=K; c++){
					sum = sum + gcd(a,b,c);
				}
			}
		}
		
		System.out.println(sum);
	}
}