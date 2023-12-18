import java.util.Scanner;

// AIZU 0009
public class Main {

	private Main(){
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			int n = in.nextInt();
			int c = n>=2 ? 1 : 0;
			for(int i=3; i<n; i+=2){
				if(isPrime(i)){
					c++;
				}
			}
			System.out.println(c);
		}
	}

	public boolean isPrime(int n) {
		if(n%2==0) return false;
		for(int i=3;i<n;i=i+2){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		new Main();
	}

}