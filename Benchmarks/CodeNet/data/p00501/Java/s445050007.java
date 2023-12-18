import java.util.Scanner;

public class Main {
	public static void main(String[] args){	
		int i , j , k;
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt(); // N:????????????????????°
		int allcount = 0;
		int [] count = new int[N];
		int [] count2 = new int[N];
		int [] firstsame = new int[N];
		int [] secondsame = new int[N];
		int [] interval = new int[N];
		
	    String name = sc.next();
		char[] nameArray = new char[name.length()];
		for(i = 0 ; i < name.length() ; i++){
			nameArray[i] = name.charAt(i);
	      //System.out.print(nameArray[i] + " ");
		}
		//System.out.println("");		

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
		for(i = 0 ; i < N ; i++){ 
out:		for(j = 0 ; j < board[i].length() ; j++){
				count[i]++;
				if(nameArray[0] == boardArray[i][j]){
					firstsame[i] = count[i];
				}
				if(firstsame[i] != 0){
					if(nameArray[1] == boardArray[i][j]){
						secondsame[i] = count[i];
						interval[i] = secondsame[i] - firstsame[i];
					}
				}
				if(secondsame[i] != 0){
					if(nameArray[2] == boardArray[i][j + interval[i]]){
						allcount++;
						break out;
					}else{
						secondsame[i] = 0;
						interval[i] = 0;
					}
				}
			}		
		}
		System.out.println(allcount);
	}
}