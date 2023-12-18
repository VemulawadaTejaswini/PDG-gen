import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner std = new Scanner(System.in);
		int array[] = new int[10];
		for(int i=0; i<10; i++){
			array[i] = Integer.parseInt(std.next());
		}
		Arrays.sort(array);
		for(int i=9; i>6; i--){
			System.out.println(array[i]);
		}
	}
}