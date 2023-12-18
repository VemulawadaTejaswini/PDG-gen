import java.util.Scanner;

public class Main {
	public static void main(String[] args){	
		int i , j , k , l;
		Scanner sc = new Scanner(System.in);	
		int N = sc.nextInt(); // N:????????????????????°
		int allcount = 0;
		int [] count = new int[N];
		int [] count2 = new int[N];
		int [] countsame = new int[N];
		int [] firstsame = new int[N];
		int [] secondsame = new int[N];
		int [] interval = new int[N];

//-------------??????????????\???----------------------------------------------		
	    String name = sc.next();
		char[] nameArray = new char[name.length()];
		for(i = 0 ; i < name.length() ; i++){
			nameArray[i] = name.charAt(i);
	      //System.out.print(nameArray[i] + " ");
		}
		//System.out.println("");		
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
out:			for(j = 0 ; j < board[i].length() ; j++){
				count[i]++;
				
				
out3:			if(nameArray[0] == boardArray[i][j]){
					firstsame[i] = count[i];
					
					for(k = count[i] ; k < board[i].length() ; k++){
						count[i]++;
						count2[i]++;
out2:					if(nameArray[1] == boardArray[i][k]){
							secondsame[i] = count[i];
							interval[i] = secondsame[i] - firstsame[i];
							
							for(l = 0 ; l < name.length() - 2 ; l++){
								if(nameArray[2 + l] != boardArray[i][secondsame[i] + interval[i] * (l + 1) - 1]){
									break out2;
								}else{
									countsame[i]++;
								}
								if(countsame[i] + 2 == name.length()){
									allcount++;
									break out;
								}
							}
							
						}
						
						if(count[i] == board[i].length()){
							count[i] = count[i] - count2[i];
							break out3;
						}
						
					}
					
				}
				
				
			}
		
		  //System.out.println(firstsame[i] + " " + secondsame[i] + " " + interval[i] + " " + allcount);
			
		}
		//System.out.println("");
		System.out.println(allcount);
	}
}