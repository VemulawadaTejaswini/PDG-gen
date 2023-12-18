import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		char ans[] = sc.next().toCharArray();		
		char board[][] = new char[n][];
		
		for(int i = 0; i < n; i++){
			board[i] = sc.next().toCharArray();
		}
		
		for(int i = 0; i < n; i++){
			search:for(int k = 0; k < board[i].length; k++){
				if(board[i][k] == ans[0]){
					for(int j = k+1; j < board[i].length; j++){
						if(board[i][j] == ans[1]){
							int diff = j - k;
							int a = 2;
//							int c = 2;
							for(int h = j + diff; h < board[i].length; h += diff){
								if(board[i][h] == ans[a] && a == ans.length - 1){
									sum++;
									break search;
								}else if(board[i][h] == ans[a]){
//									c++;
									a++;
								}else{
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(sum);
	}

}