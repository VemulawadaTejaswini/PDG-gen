
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Scanner;

// Aizu 0009
public class Main {

	private Main(){
		try(Scanner in = new Scanner(System.in)){
			while(in.hasNext()){
				int n = in.nextInt();
				System.out.println(calcPrimeNum(n));
			}
		}
	}

	public int calcPrimeNum(int limit){
		BitSet sieve = new BitSet(limit+1);
		ArrayList<Integer> primeList = new ArrayList<Integer>();
		for(int i=2;i<=limit;i++){
			if(!sieve.get(i)){
				primeList.add(i);
				int j = i;
				while(j<=limit){
					sieve.set(j, true);
					j+=i;
				}
			}
		}
		return primeList.size();
	}

	public static void main(String[] args) {
		new Main();
	}

}