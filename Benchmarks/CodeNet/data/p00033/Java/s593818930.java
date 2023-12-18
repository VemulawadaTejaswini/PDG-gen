import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] ball = new int[10];
		int[] B = new int[10];
		int[] C = new int[10];
		boolean flag = true;
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 10; j++){
				ball[j] = scan.nextInt();
			}
			int count = 0;
			int j = 0, k = 0;
			while(count < 10){
				if(B[j] < ball[count]){
					B[j] = ball[count];
					count++;
					j++;
				} else if(C[k] < ball[count]){
					C[k] = ball[count];
					count++;
					k++;
				} else{
					flag = false;
					break;
				}
			}
			System.out.printf("%s\n", flag? "YES" : "NO");
		}
	}
}