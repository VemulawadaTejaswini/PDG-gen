import java.util.*;

public class Main{
	private static final Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		int[] ball = new int[10];
		int N = scan.nextInt();
		for(int i = 0; i < N; i++){
			for(int j = 0; j < 10; j++){
				ball[j] = scan.nextInt();
			}
			int min1 = 0;
			int min2 = 0;
			boolean flag = true;
			for(int j = 0; j < 10; j++){
				if(min1 < ball[j]){
					min1 = ball[j];
				} else if(min2 < ball[j]){
					min2 = ball[j];
				} else{
					flag = false;
					break;
				}
			}
			System.out.printf("%s\n", flag? "YES" : "NO");
		}
	}
}