import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		//int[] a = new int[k + k - 1];
		for(int i=0; i<k + k - 1; i++){
			//a[i] = x - k + 1 + i;
			System.out.print(x - k + 1 + i + " ");
		}
	}
}
