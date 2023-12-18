import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int c = stdIn.nextInt();
		int[][] result = new int[1000][];
		int index = 0;
		
		while( a != 0 || b != 0 || c != 0 ){
			int N = stdIn.nextInt();
			int[][] check = new int[N][4];
			for(int i = 0; i < N; i++){
				for(int j = 0; j < 4; j++){
					check[i][j] = stdIn.nextInt();
				}
			}
			result[index] = new int[a+b+c];
			for(int i = 0; i < N; i++){
				if( check[i][3] == 1 ){
					for(int j = 0; j < 3; j++){
						result[index][check[i][j]-1] = -1;
					}
				}
			}
			for(int i = 0; i < N; i++){
				if( check[i][3] == 0 ){
					int count = 0;
					int key = -1;
					for(int j = 0; j < 3; j++){
						if( result[index][check[i][j]-1] == -1 ){
							count++;
						} else {
							key = j;
						}
					}
					if( count == 2 ){
						result[index][check[i][key]-1] = -2;
					}
				}
			}
			index++;
			a = stdIn.nextInt();
			b = stdIn.nextInt();
			c = stdIn.nextInt();
		}
		
		for(int i = 0; i < index; i++){
			for(int j = 0; j < result[i].length; j++){
				System.out.println(result[i][j]+2);
			}
		}
	}
}