import java.util.Scanner;
//import java.util.Arrays;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int d = sc.nextInt();
		int x = sc.nextInt();
		int[] xArray = new int[10];
		xArray[0] = r * x - d;
		for(int i=1; i<10; i++){
			xArray[i] = r * xArray[i-1] - d;
		}
		for(int a : xArray){
			System.out.println(a);
		}
	}
}
