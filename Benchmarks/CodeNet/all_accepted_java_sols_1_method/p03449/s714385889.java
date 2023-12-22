import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		int N = sc.nextInt();
		int[] array1 = new int[N];
		int[] array2 = new int[N];
		for(int i=0; i<N; i++)
			array1[i] = sc.nextInt();
		for(int i=0; i<N; i++)
			array2[i] = sc.nextInt();
		
		int candies = 0;
		int total1 = 0;
		int total2 = 0;
		int total3 = 0;

		for(int i=0; i<N; i++) {
			total1 += array1[i];
			total2 = 0;
			for(int j=i; j<N; j++) {
				total2 += array2[j];
			}
			total3 = total1 + total2;
			if(candies < total3)
				candies = total3;
		}
		System.out.println(candies);
	}

} 
   