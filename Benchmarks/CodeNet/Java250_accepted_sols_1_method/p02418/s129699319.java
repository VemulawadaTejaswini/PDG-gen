import java.util.Scanner;

public class Main {
	
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		String s = scan.nextLine();
		String p = scan.nextLine();
		scan.close();
		
		String ss = s + s;
		
		String strJudge = null;
		boolean isYes = false;
		for(int i = 0; i < ss.length(); i++){
			
			if(p.length() < ss.length()  - i){
				strJudge = ss.substring(i, i + p.length());
				//System.out.println(i + ":strJudge:" + strJudge);
			}
			
			if(p.equals(strJudge)){
				System.out.println("Yes");
				isYes = true;
				break;
			}			
		}
		if(!isYes){
			System.out.println("No");
		}
	}

}