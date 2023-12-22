import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] numArray = new int[n];

		for(int i = 0; i < n; i++){
			numArray[i] = sc.nextInt();
		}

		double sum = 0;
		for(int i = 0; i < n; i++){
			sum += 1.0/numArray[i];
		}

		System.out.println(1.0/sum);
	}
}