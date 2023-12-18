import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		int[] array1 = new int[scan.nextInt()];
		for(int i=0; i<array1.length; i++) {
			array1[i]=scan.nextInt();
		}
		int[] array2 = new int[scan.nextInt()];
		for(int i=0; i<array2.length; i++) {
			array2[i]=scan.nextInt();
		}
		
		int output = 0;
		HashMap<Integer, Integer> a1Map = new HashMap<Integer, Integer>();
		for(int i = 0; i<array1.length; i++) {
			a1Map.put(array1[i],0);
		}
		
		for(int i = 0; i<array2.length; i++) {
			if(a1Map.containsKey(array2[i])) {
				if(a1Map.get(array2[i])==0) {
					a1Map.replace(array2[i],0);
					output++;
				}
			}
		}
		System.out.println(output);
		
		
	}
}
