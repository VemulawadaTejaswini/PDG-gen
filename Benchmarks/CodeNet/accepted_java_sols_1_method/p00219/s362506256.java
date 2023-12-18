import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		boolean is = true;
		
		while(sc.hasNextInt()){
			int[] buy = new int[10];
			int n = sc.nextInt();
			if(n == 0)break;
			
			for(int i = 0; i < n; i++){
				buy[sc.nextInt()] += 1;
			}
			
			for(int i = 0; i < 10; i++){
				is = true;
				for(int u = 0; u < buy[i]; u++){
					is = false;
					System.out.print("*");
				}
				if(is)System.out.print("-");
				System.out.println();
			}
		}
		sc.close();
	}
}