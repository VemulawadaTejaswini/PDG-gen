import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int temp;
		int[] height = new int[10];
		Scanner cin = new Scanner(System.in);
		for(int i=0;i<10;i++) {
			height[i] = cin.nextInt();
		}
		for(int i=0;i<10;i++) {
			for(int j=i+1;j<10;j++) {
				if(height[i]<height[j]) {
					temp = height[i];
					height[i] = height[j];
					height[j] = temp;
				}
			}
		}
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
	}
}
