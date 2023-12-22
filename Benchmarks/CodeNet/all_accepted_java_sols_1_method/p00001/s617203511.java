import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		int height[] = new int[10];
		Scanner in = new Scanner(System.in);
		for(int i = 0;i<10;i++){
			try{
				height[i] = in.nextInt();
			}catch(Exception e){
				break;
			}
		}
		Arrays.sort(height);
		System.out.println(height[9]);
		System.out.println(height[8]);
		System.out.println(height[7]);
	}
}