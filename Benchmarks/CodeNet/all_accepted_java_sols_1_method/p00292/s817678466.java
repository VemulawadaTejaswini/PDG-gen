import java.util.Scanner;

class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n;
		int k, p;
		
		n = scan.nextInt();
		for(int i = 0; i < n; i++){
			k = scan.nextInt();
			p = scan.nextInt();
			
			if(k % p == 0)System.out.println(p);
			else System.out.println(k%p);
		}
	}
}