import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		
		int index = 0;
		int[][] employee = new int[1000][4001];
		int[][] result = new int[1000][4001];
		int[][] ans = new int[1000][4001];
		
		while( n != 0 ){
			int count = 1;
			int[] check = new int[4001];
			for(int i = 0; i < n; i++){
				int id = stdIn.nextInt();
				long p = stdIn.nextLong();
				long q = stdIn.nextLong();
				if( check[id] == 0 ){
					check[id] = count;
					employee[index][count] = id;
					count++;
				} 
				result[index][check[id]] += p*q;
				if( p*q >= 1000000 || result[index][check[id]] >= 1000000 ){
					ans[index][check[id]] = 1;
				}
			}
			n = stdIn.nextInt();
			index++;
		}
		
		for(int i = 0; i < index; i++){
			boolean flag = false;
			for(int j = 1; j < 4001; j++){
				if( employee[i][j] == 0 ){
					if( !flag ){
						System.out.println("NA");
					}
					break;
				} else if( ans[i][j] == 1 ){
						System.out.println(employee[i][j]);
						flag = true;
				}
			}
		}
	}
}