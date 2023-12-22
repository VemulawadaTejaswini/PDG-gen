import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Integer[] array = new Integer[5];
		for(int i = 0; i < 5; ++i) {
		    int tmp = sc.nextInt();
		    array[i] = tmp;
		}
		int k = Integer.parseInt(sc.next());
		
		
		
		
		
		if(array[4] - array[0] <= k) System.out.println("Yay!");
		else System.out.println(":(");
	}
}