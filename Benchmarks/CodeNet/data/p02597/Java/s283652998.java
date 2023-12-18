import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		int numberOfStones = s.nextInt();
		
		String stones = s.next();
		
		int counter = 0;
		
		
		
			
			for(int i = 0; i < stones.length() - 1; i++){
				
				if(stones.charAt(i) == 'W' && positionOfLastR(stones) > i){
					
					stones = swap(stones, i, positionOfLastR(stones));
					counter++;
					
				}
				
			}
			
		
		
		System.out.println(counter);
		
		}
		
		public static boolean isOkay(String str){
			
			for(int i = 0; i < str.length() - 1; i++){
				if(str.charAt(i) == 'W' && str.charAt(i+1) == 'R'){
					return false;
				}
			}
			
			return true;
		}
	
		public static int positionOfLastR(String str){
			
			for(int i = str.length() - 1; i >= 0; i--){
				if(str.charAt(i) == 'R'){
					return i;
				}
			
				if(i == 0){
					return -1;
				}
			}
			
			return 0;
		}
	
		public static String swap(String s, int l, int m){
		
		char[] charArray = s.toCharArray();
		char temp = charArray[l];
		charArray[l] = charArray[m];
		charArray[m] = temp;
		String returnString = "";
		
		for(int i = 0; i < charArray.length; i++){
			returnString += charArray[i];
		}
			
		return returnString;	
		}
		
	
}
