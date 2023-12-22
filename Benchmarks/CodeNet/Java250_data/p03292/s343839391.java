import java.util.*;

class Main{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		int max = 0;
		int min = 100;

		for(int i = 0; i<3; i++){
			int A = sc.nextInt();
			max = Math.max(max,A);
			min = Math.min(min,A);
		}
			System.out.println(max - min);
	}
}