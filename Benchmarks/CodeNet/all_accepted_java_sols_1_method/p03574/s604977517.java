import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int h = scan.nextInt();
	int w = scan.nextInt();
	/* マスの状態 */
	/* 番兵的に作成 */
	String[] s = new String[h+2];
	/* 下準備 */
	s[0] = "#";
	s[h+1] = "#";
	for(int i = 0; i < h+2; i++){
	    if(i == 0 || i == h+1){
		for(int j = 0; j < w+1; j++){
		    s[i] += "#";
		}
	    }else{
		s[i] = scan.next();
		s[i] = "#"+s[i]+"#";
	    }
	}

	/* デバッグ */
	/*
	for(int i = 0; i < h+2; i++){
	    for(int j = 0; j < w+2; j++){
		System.out.print(s[i].charAt(j));
	    }
	    System.out.println();
	}
	System.out.println();
	*/

	int[][] board = new int[h+2][w+2];

	for(int i = 1; i < h+1; i++){
	    for(int j = 1; j < w+1; j++){
		/* 左上から半時計回りにチェックしていく */
		if(s[i].charAt(j) == '#'){
		    board[i][j] = -1;
		    if(s[i-1].charAt(j-1) == '.'){
			board[i-1][j-1]++;  //左上
		    }
		    if(s[i-1].charAt(j) == '.'){
			board[i-1][j]++;  //上
		    }
		    if(s[i-1].charAt(j+1) == '.'){
			board[i-1][j+1]++;  //右上
		    }
		    if(s[i].charAt(j+1) == '.'){
			board[i][j+1]++;  //右
		    }
		    if(s[i+1].charAt(j+1) == '.'){
			board[i+1][j+1]++;  //右下
		    }
		    if(s[i+1].charAt(j) == '.'){
			board[i+1][j]++;  //下
		    }
		    if(s[i+1].charAt(j-1) == '.'){
			board[i+1][j-1]++;  //左下
		    }
		    if(s[i].charAt(j-1) == '.'){
			board[i][j-1]++;  //左
		    }
		}
	    }
	}

	for(int i = 1; i < h+1; i++){
	    for(int j = 1; j < w+1; j++){
		if(board[i][j] == -1){
		    System.out.print('#');
		}else{
		    System.out.print(board[i][j]);
		}
	    }
	    System.out.println();
	}
    }
}
