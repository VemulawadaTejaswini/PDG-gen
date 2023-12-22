import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static boolean quo(int n) {
		if((n == 0)||(n == 1)) {
			return false;
		}else{
			for(int i = 2; i<= Math.sqrt(n); i+=1) {
				if(n%i == 0) {
					return false;
				}
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = Integer.parseInt(sc.nextLine());
		
		int i = 0;
		int[] numbs = new int[size];
		ArrayList<Integer> result = new ArrayList<Integer>();
		while (i<size) {
			numbs[i] = Integer.parseInt( sc.nextLine());
			if(quo(numbs[i])) {
				result.add(numbs[i]);
			}
			i+=1;
		}
		System.out.println(result.size());
	}

}

