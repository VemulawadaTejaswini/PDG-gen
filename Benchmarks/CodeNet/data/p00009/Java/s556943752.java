import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;


public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n;
		while(sc.hasNextInt()) {
			n = sc.nextInt();
			System.out.println(primeNumbers(n).size());
		}
		sc.close();
	}
	
	static boolean isMultipleOf(int n, int m) {
		if(n % m == 0) return true;
		else return false;
	}
	
	static List<Integer> primeNumbers(int n) {
		List<Integer> result = new ArrayList<Integer>();
		loop:for(int i = 2; i <= n; i++) {
			Iterator<Integer> it = result.iterator();
			while(it.hasNext()) {
				int temp = it.next();
				if(isMultipleOf(i, temp)) continue loop;
			}
			result.add(i);
		}
		return result;
	}
}