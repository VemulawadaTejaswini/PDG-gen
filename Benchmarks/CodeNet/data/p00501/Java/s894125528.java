import java.util.Scanner;

public class Main {
	public static void main(String[] args){	
		int i , j , k , l;
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt();
		int allcount = 0;
		int [] interval = new int[N];
		int [] nameArrayIndex = new int[N];
//-------------??????????????\???----------------------------------------------		
	    String name = sc.next();
		char[] nameArray = new char[name.length()];
		for(i = 0 ; i < name.length() ; i++){
			nameArray[i] = name.charAt(i);
		}		
//-------------??????????????\???----------------------------------------------
	    String[] board = new String[N];
		for(i = 0 ; i < N ; i++){
			board[i] = sc.next();
		}
		char[][] boardArray = new char[N][100];
		for(i = 0 ; i < N ; i++){
			for(j = 0 ; j < board[i].length() ; j++){
				boardArray[i][j] = board[i].charAt(j);
			}
		}
//------------------------------------------------------------
		for(i = 0 ; i < N ; i++){
out1:		for(j = 0 ; j < board[i].length() ; j++){
				if(boardArray[i][j] == nameArray[0]){
					for(k = j + 1 ; k < board[i].length() ; k++){
						if(boardArray[i][k] == nameArray[1]){
							interval[i] = k - j ;
							nameArrayIndex[i] = 2;
							for(l = k + interval[i] ; l < board[i].length() ; l = l + interval[i]){
								if(boardArray[i][l] == nameArray[nameArrayIndex[i]]){
									if(nameArrayIndex[i] == name.length() - 1){
										allcount++;
										break out1;
									}
									nameArrayIndex[i]++;
								}else{
									break;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(allcount);
	}
}