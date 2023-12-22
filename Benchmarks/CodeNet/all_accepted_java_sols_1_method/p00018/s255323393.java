import java.util.*;

class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Integer[] num = new Integer[5];
		
		for(int i = 0; i < 5; i++) {
			num[i] = scan.nextInt();
		}
		
		Arrays.sort(num, Collections.reverseOrder());
		
		System.out.println(num[0] + " " + num[1] + " " + num[2] + " " + num[3] + " " + num[4]);
	}
}