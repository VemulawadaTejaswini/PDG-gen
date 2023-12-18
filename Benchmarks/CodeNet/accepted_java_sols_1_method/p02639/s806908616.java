import java.util.*;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 5;
		int count = 0;
		int[] x = new int[N];
		for(int i = 0; i < N; i ++){
			x[i] = sc.nextInt(); 

			if(x[i] == 0){
				count = i + 1;
				break;
			}
		}

		System.out.println(count);
	}
}