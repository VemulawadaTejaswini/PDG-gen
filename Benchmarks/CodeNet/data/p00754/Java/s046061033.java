import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			String str = scan.nextLine();
			if(str.equals(".")){
				break;
			}
			char[] sta = new char[100];
			int sp = 0;
			boolean sw = false;
			for(int i = 0;i < str.length();i++){
				switch(str.charAt(i)){
				case '(':
					sta[sp++] = '(';
					break;
				case '[':
					sta[sp++] = '[';
					break;
				case ')':
				    if(sp == 0){
				    	sw = true;
				    }else if(sta[--sp] == '('){
					}else{
						sw = true;
					}
					break;
				case ']':
					if(sp == 0){
				    	sw = true;
				    }else if(sta[--sp] == '['){
					}else{
						sw = true;
					}
					break;
					default:
						break;
				}
				if(sw){
					break;
				}
			}
			if(sw){
				System.out.println("no");
			}else{
				System.out.println((sp == 0)?"yes":"no");
			}
		}
	}
}