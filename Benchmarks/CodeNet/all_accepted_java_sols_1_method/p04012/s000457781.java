import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String w = scan.nextLine();
		
		char c = w.charAt(0);
		int cc = 0;
		
		for(int i = 0 ; i < w.length() ; i++){
			
			if(c == w.charAt(i)){
				cc++;
			}
			String a = c + "";
			if(i == w.length() - 1){
				w = w.replaceAll(a , "");
				
				if(cc % 2 != 0){
					System.out.println("No");
					break;
				}
				
				if(w.length() != 0){
					c = w.charAt(0);
					cc = 1;
					i = 0;
				} else if(w.length() == 0){
					System.out.println("Yes");
					break;
				}
			}
		}
	}
}
