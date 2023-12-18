import java.util.Arrays;
import java.util.Scanner;
public class Sort {
	
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] mylist = new int[10];
		for(int i = 0; i<10; i++){
			int a = in.nextInt();
			mylist[i] = a;
		}
		Arrays.sort(mylist);
		System.out.println(mylist[9]);
		System.out.println(mylist[8]);
		System.out.println(mylist[7]);
	}	
}