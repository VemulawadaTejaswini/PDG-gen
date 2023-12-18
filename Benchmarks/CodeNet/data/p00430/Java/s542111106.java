import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n;
		
		while((n = scan.nextInt()) > 0){
			int[] a = new int[n];
			a[0] = n;
			int i = 0;
			int m = 1;
			
			while(a[0] > 1){
				if(a[i] == 1)
					i --;
				else if(a[i] > 1 && a[i] - a[i + 1] > 1){
					for(int j = 0; a[j] != 0; j ++)
						System.out.print(a[j] + " ");
					System.out.println();
					
					a[i] --;
					a[i + 1] ++;
				}else if(a[i] > 1 && a[i] - a[i + 1] == 1){
					for(int j = 0; a[j] != 0; j ++)
						System.out.print(a[j] + " ");
					System.out.println();
					a[i] --;
					a[m] ++;
				}else
					i ++;
				if(a[m] > 0)
					m ++;
			}
			for(int j = 0; j < n; j ++)
				System.out.print(a[j] + " ");
			System.out.println();
		}
	}
}