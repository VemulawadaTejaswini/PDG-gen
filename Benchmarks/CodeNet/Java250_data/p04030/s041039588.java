import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		
		Scanner scan  = new Scanner(System.in);
		
		String S = scan.next();
		
		
		StringBuilder edit = new StringBuilder();
		
		for(int i = 0;i<S.length();i++){
			switch(S.substring(i, i+1)){
			case "B":
				if(edit.toString().equals("")){
					break;
				}else{
					edit.delete(edit.toString().length()-1, edit.toString().length());
					break;
				}
			case "0":
				edit.append("0");
				break;
				
			case "1":
				edit.append("1");
				break;
			
			}
		}
		
		System.out.println(edit.toString());
		
		
	}
	

}
