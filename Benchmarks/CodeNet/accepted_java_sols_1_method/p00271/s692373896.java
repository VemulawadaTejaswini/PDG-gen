import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[7][2];
		for(int i = 0; i < 7; i++)
			for(int u = 0; u < 2; u++)
				a[i][u] = sc.nextInt();
		
		for(int i = 0; i < 7; i++)
			System.out.println(a[i][0] - a[i][1]);
		}
	}