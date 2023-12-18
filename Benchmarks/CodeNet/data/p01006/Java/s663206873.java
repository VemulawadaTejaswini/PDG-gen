import java.util.Scanner;
 
class Main{

	public static final String [][] PANEL = { { "A" , "B" , "C" } ,
						  { "D" , "E" , "F" } ,
						  { "G" , "H" , "I" } };
	public static void main(String[] args){
    		Scanner sc = new Scanner(System.in);
    		String str;
    		while(sc.hasNext()){
			str = sc.next();
			if( panelSearch(str) ){
				System.out.println(str);
			}
		}
		
    	}

	public static boolean panelSearch(String str){
		int tmp = -1;
		int num;
		for( int cnt = 0;cnt < str.length();cnt++){
			num = seach(str.charAt(cnt));
			if( cnt == 0 ){
				tmp = num;
				continue;
			}
			if( Math.abs(tmp - num) != 1 || num == -1 ){
				return false;
			}
			tmp = num;
		}
		return true;
	}

	public static int seach(char c){
		
		for( int xCnt = 0;xCnt < 3;xCnt++ ){
			for( int yCnt = 0;yCnt < 3;yCnt++ ){
				if( PANEL[xCnt][yCnt].equals(c) ){
					return xCnt + yCnt;
				}
			}
		}
		return -1;
	}
}