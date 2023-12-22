import java.util.Scanner;

class Main{
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String string = scanner.next();
		
		String ans = "";
		
		for(int i = 0;i < string.length();i++){
			String aString =  string.substring(i,i+1);
			
			if(aString.equals("1")){
				
				ans = ans+ "9";
				
				
			}else if(aString.equals("9")){
				
				ans = ans + "1";
			}else{
				
				ans = ans + aString;
			}
		}
		
		System.out.println(ans);
		
	}
}

