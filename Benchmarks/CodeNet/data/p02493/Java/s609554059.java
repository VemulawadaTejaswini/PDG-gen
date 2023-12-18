import java.io.InputStreamReader;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner scan= null;
		try{
			scan = new Scanner(new InputStreamReader(System.in));
			int n = scan.nextInt();
			int[] dataset = new int[n];
			for(int i = 0; i < n;i++)
				dataset[i] = scan.nextInt();
			for(int i = n - 1 ;i >=0;i--){
				System.out.print(dataset[i]);
				if(i !=0)
					System.out.print(" ");
				else
					System.out.println();
			}
		}finally{
			scan.close();
		}
	}
}