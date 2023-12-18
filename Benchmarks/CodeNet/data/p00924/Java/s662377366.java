
import java.util.Scanner;
import java.util.Vector;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int inputBinary[] = new int[n];
		int numZero = 0;
		for(int i = 0; i < n; i++) {
			inputBinary[i] = sc.nextInt();
			if(inputBinary[i] == 0) {
				numZero++;
			}
		}
		
		int inputSegment[] = new int[m];
		
		for(int i = 0; i < m; i++) {
			inputSegment[i] = sc.nextInt();
		}
		
		boolean isZero = true;
		Vector<Integer> vec1 = new Vector<Integer>();
		Vector<Integer> vec2 = new Vector<Integer>();
		
		int index = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < inputSegment[i]; j++) {
				if(isZero) {
					vec1.add(index);
				}
				else {
					vec2.add(index);
				}
				
				index++;
			}
			isZero = !isZero;
		}
		
		int vecIndex = 0;
		int result1 = Integer.MAX_VALUE;
		if(numZero == vec1.size()) {
			result1 = 0;
			for(int i = 0; i < n; i++) {
				if(inputBinary[i] == 0) {
					result1 += Math.abs(i - vec1.get(vecIndex));
					vecIndex++;
				}
			}
		}
		vecIndex = 0;
		int result2 = Integer.MAX_VALUE;
		if(numZero == vec2.size()) {
			result2 = 0;
			for(int i = 0; i < n; i++) {
				if(inputBinary[i] == 0) {
					result2 += Math.abs(i - vec2.get(vecIndex));
					vecIndex++;
				}
			}
		}		
		System.out.println(Math.min(result1, result2));
	}

}

