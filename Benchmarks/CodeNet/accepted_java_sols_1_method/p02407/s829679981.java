import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] ary = new int[n];
		
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		for(int i=n-1; i>=0; i--){
			System.out.print(ary[i]);
			if(i == 0){
				break;
			}else{
				System.out.print(" ");
			}
		}
		System.out.println();
		in.close();
	}
}