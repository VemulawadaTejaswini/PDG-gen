import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner S = new Scanner(System.in);
		
		int N = S.nextInt();
		int[] data = new int[N];
		
		for(int i = 0;i < N;i++){
			data[i] = S.nextInt();
		}
		
		for(int i = N - 1;i >= 0;i--){
			if(i == 0)
				System.out.println(data[i]);
			else
				System.out.print(data[i]+" ");
		}
		
	}
}