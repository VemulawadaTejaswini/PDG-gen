import java.util.Scanner;
import java.util.Stack;


public class Main {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);

		while(true){
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			if(N == 0 && M == 0){
				break;
			}
			int r = sc.nextInt();
			int[][] log = new int[4][r]; 
			for(int i = 0; i < r; i++){
				for(int j = 0; j < 4; j++){
					log[j][i] = sc.nextInt();
				}
			}
			int q = sc.nextInt();
			int[][] question = new int[3][q];
			for(int i = 0; i < q; i++){
				for(int j = 0; j < 3; j++){
					question[j][i] = sc.nextInt();
				}
			}
			
			for(int i = 0; i < q; i++){
				Stack<Integer> stack = new Stack<Integer>();
				int sum = 0;
				for(int j = 0; j < r; j++){
					if(question[1][i] < log[0][j] && !stack.empty()){
						if(question[0][i] > log[0][j -1]){
							sum = sum + question[1][i] - question[0][i];
							break;
						}else{
							sum = sum + question[1][i] - log[0][j - 1];
							break;	
						}
					}
					if(question[0][i] < log[0][j] && !stack.empty()){
						if(question[0][i] > log[0][j -1]){
							sum = sum + log[0][j] - question[0][i];
						}else{
							sum = sum + log[0][j] - log[0][j - 1];
						}
					}
					if(question[2][i] == log[2][j] && log[3][j] == 1){
						stack.push(0);
					}
					if(question[2][i] == log[2][j] && log[3][j] == 0){
						stack.pop();
					}
				}
				System.out.println(sum);
				
			}
		}
		
	}

}