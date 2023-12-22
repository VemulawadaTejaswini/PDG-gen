import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] h = new int[11];
		int hz = 0;
		for(int i=1; i<=10; i++){
			h[i] = sc.nextInt();
		}
		for(int i=9; i>=1; i--){
			for(int j=1; j<=i; j++){
				if(h[j] <= h[j+1]){
					hz = h[j+1];
					h[j+1] = h[j];
					h[j] =hz;
				}
			}
		}
		for(int i=1; i<=3; i++){
			System.out.println(h[i]);
		}
	}
}