import java.util.Scanner;
import java.util.Arrays;

class Main{
	public static void main(String[] args){
		Integer[] ary = new Integer[10];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < ary.length; ++i){
			ary[i] = sc.nextInt();
		}
		
		Arrays.sort( ary );
		
		System.out.println(ary[9]);
		System.out.println(ary[8]);
		System.out.println(ary[7]);
	}
}