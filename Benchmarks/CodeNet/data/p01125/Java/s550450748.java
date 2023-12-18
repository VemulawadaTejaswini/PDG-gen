import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		String[] result = new String[100];
		int index = 0;
	
		while( n != 0 ){			
			int[][] stone = new int[n][2];
			for(int i = 0; i < n; i++){
				stone[i][0] = stdIn.nextInt();
				stone[i][1] = stdIn.nextInt();
			}
			int m = stdIn.nextInt();
			String[] direction = new String[m];
			int[] distance = new int[m];
			for(int i = 0; i < m; i++){
				direction[i] = stdIn.next();
				distance[i]= stdIn.nextInt();
			}
			int[] now = new int[2];
			now[0] = 10;
			now[1] = 10;
			int count = 0;
			for(int i = 0; i < m; i++){
				if( direction[i].equals("N")){
					for(int j = 1; j <= distance[i]; j++){
						now[1]++;
						for(int k = 0; k < stone.length; k++){
							if( stone[k][0] == now[0] && stone[k][1] == now[1] ){
								stone[k][0] = -1;
								stone[k][1] = -1;
								count++;
							}
						}
					}
				} else if( direction[i].equals("S")){
					for(int j = 1; j <= distance[i]; j++){
						now[1]--;
						for(int k = 0; k < stone.length; k++){
							if( stone[k][0] == now[0] && stone[k][1] == now[1] ){
								stone[k][0] = -1;
								stone[k][1] = -1;
								count++;
							}
						}
					}
				} else if( direction[i].equals("E")){
					for(int j = 1; j <= distance[i]; j++){
						now[0]++;
						for(int k = 0; k < stone.length; k++){
							if( stone[k][0] == now[0] && stone[k][1] == now[1] ){
								stone[k][0] = -1;
								stone[k][1] = -1;
								count++;
							}
						}
					}
				} else if( direction[i].equals("W")){
					for(int j = 1; j <= distance[i]; j++){
						now[0]--;
						for(int k = 0; k < stone.length; k++){
							if( stone[k][0] == now[0] && stone[k][1] == now[1] ){
								stone[k][0] = -1;
								stone[k][1] = -1;
								count++;
							}
						}
					}
				}
				if( count == n ){
					break;
				}
			}
			if( count == n ){
				result[index] = "Yes";
			} else {
			 	result[index] = "No";
			}
			index++;
			n = stdIn.nextInt();
		}
		for(int i = 0; i < index; i++){
			System.out.println(result[i]);
		}
	}
}