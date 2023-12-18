import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	static boolean[] used = new boolean[10];
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true){
			try{
				int n = scan.nextInt();
				int s = scan.nextInt();
				System.out.println(solve(n, s));
			}catch(NoSuchElementException e){
				//DO NOTHING
			}
		}
	}

	private static int solve(int numRemained, int s){
		if(s < 0)
			return 0;
		
		if(numRemained < 1){
			if(s == 0)
				return 1;
			else
				return 0;
		}
		
		int c = 0;
		for(int i = 0; i < 10; i++){
			if(used[i])	continue;
			used[i] = true;
			c += solve(numRemained - 1, s - numRemained * i);
			used[i] = false;
		}
		return c;
	}
}