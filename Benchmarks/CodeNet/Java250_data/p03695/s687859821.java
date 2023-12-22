import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] color = new int[9];
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(a >= 3200) color[8]++;
			else color[a / 400]++;
		}
		int min = 0;
		for(int i = 0; i < 8; i++) if(color[i] > 0) min++;
		System.out.println((min == 0 ? 1 : min) + " " + (color[8] + min));
	}
}
