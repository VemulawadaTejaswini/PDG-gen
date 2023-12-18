import java.util.Scanner;
public class Main {
	public static boolean stringMach(char[] base,String boardStr) {
		int boardStrlen = boardStr.length()-1; 
		int baseIndex = 0;
		for(int i=0;i<boardStrlen;i++){
			if(base[baseIndex]==boardStr.charAt(i)){
				baseIndex++;
				for(int j=i+1;j<boardStrlen;j++){
					if(base[baseIndex]==boardStr.charAt(j)){
						int margin = j-i;
						baseIndex++;
						for(int k=j+margin;k<=boardStrlen;k+=margin){
							if(base[baseIndex]==boardStr.charAt(k)){
								baseIndex++;
								if(baseIndex==base.length){
									return true;
								}
							}
						}
					}
				}
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int boardNam = sc.nextInt();
		String [] board  = new String[25];
		char base[] = sc.next().toCharArray();
		boolean ans[] = new boolean[boardNam];
		int trueNum = 0;
		for(int i=0;i<boardNam;i++){
			board[i] = sc.next();
		}
		for(int i=0;i<boardNam;i++){
			ans[i] = stringMach(base, board[i]);
			if(stringMach(base, board[i])){
				trueNum++;
			}
		}
		System.out.println(trueNum);
	}
}