import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int n = Integer.parseInt(std.next());
		int array[];
		array = new int[n];
		for (int i=0; i<=n-1; i++){
			array[i] = Integer.parseInt(std.next());
		}
		String ret = "";
		for (int j=n-1; j>=1; j--){
			ret += array[j] + " ";
		}
		ret += array[0];
		System.out.println(ret);
	}
}