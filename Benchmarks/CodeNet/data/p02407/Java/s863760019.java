import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n;
		
		n=in.nextInt();
		int[] ary = new int[n];
		
		for(int i=0; i<n; i++){
			ary[i] = in.nextInt();
		}
		
		if(n!=1){
			int i = n-1;
			System.out.print(ary[i]);
			i--;
			do{
				System.out.print(" ");
				System.out.print(ary[i]);
				i--;
			}while(i>=0);

		}else{
			System.out.print(ary[0]);
		}

		in.close();
	}
}