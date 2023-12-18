
import java.util.Scanner;

public class Main {
	char [][] data;
	
	private char check(int x, int y){
		char ans = data[y][x];
		//tate
		if(ans == data[y+1][x] && ans == data[y-1][x]){
			return ans;
		}
		//yoko
		if(ans == data[y][x+1] && ans == data[y][x-1]){
			return ans;
		}
		//naname
		if(ans == data[y-1][x-1] && ans == data[y+1][x+1]){
			return ans;
		}
		if(ans == data[y-1][x+1] && ans == data[y+1][x-1]){
			return ans;
		}
		return '+';
		
	}

	private void doit() {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			if(str.equals("0")){
				break;
			}
			data = new char[5][5];
			for(int i = 0; i < 5; i++){
				data[0][i] = '*';
				data[4][i] = '*';
			}
			for(int i = 0; i < 5; i++){
				data[i][0] = '*';
				data[i][4] = '*';
			}
			for(int i =0 ; i< 3; i++){
				data[1][i+1] = str.charAt(i);
			}
			for(int i = 2; i <= 3; i++){
				str = sc.next();
				for(int j = 0; j < 3; j++){
					data[i][j + 1] = str.charAt(j);
				}
			}
			char ans = '+';
			for(int i =1; i < 4; i++){
				for(int j = 1; j < 4; j++){
					if(data[i][j] == '+') continue;
					char result = check(j,i);
					if(result == 'b' || result == 'w'){
						ans = result;
						break;
					}
				}
				if(ans == 'b' || ans == 'w') break;
			}
			if(ans == 'b')
				System.out.println("b");
			else if(ans == 'w')
				System.out.println("w");
			else
				System.out.println("NA");
			
		}
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();

	}

}