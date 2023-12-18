import java.util.Scanner;

public class Main {
	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.next());
		
		Long aArray[] = new Long[n];
		for (int i = 0; i<n; i++) {
			aArray[i] = Long.parseLong(sc.next());
		}
		
		
		long result = 0;
		long modVal =  10*10*10*10*10*10*10*10*10 + 7;
		for (int i = 0; i<aArray.length; i++) {
			Long ai = aArray[i];
			for (int j = i +1; j<aArray.length; j++) {
				Long aj = aArray[j];
				result += ai*aj;
				if (modVal < result) {
					result = result % modVal;
				}
			}
		}
		System.out.println(result);
	}	

}
