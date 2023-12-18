import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] x = new int[3];
		x[0] = sc.nextInt();
		x[1] = sc.nextInt();
		x[2] = sc.nextInt();
		int buf;
		for(int i = 0; i < x.length - 1; i++){
			for(int j = i + 1; j < x.length; j++){
				if(x[i] > x[j]){
					buf = x[i];
					x[i] = x[j];
					x[j] = buf;
				}
			}
		}
		for(int i = 0; i < x.length; i++)
			System.out.printf("%d ", x[i]);
		System.out.printf("\n");
	}
}