import java.util.*;

public class Main {
	public Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		while(sc.hasNext()){
			new AOj0017().doIt();
		}
	}
	class AOj0017{
		void doIt(){
			String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
			String input = sc.nextLine();
			for(int i=0;i<=26;i++){//?????????
				StringBuffer sb = new StringBuffer("");
				for(int s=0;s<input.length();s++){
					if(input.charAt(s) != ' ' && input.charAt(s) != '.'){
						int index = textIndex(input.charAt(s));
						sb.append(text.charAt(index + i));
					}else sb.append(input.charAt(s));
//					System.out.println(sb.toString());
				}
				if(isOk(sb.toString()) == true){
					System.out.println(sb.toString());
					if(i == 0)break;
				}
			}
		}
		
		boolean isOk(String t){
			String[] str = t.split(" ");
			for(int i = 0;i < str.length;i++){
				if(str[i].equals("this") || str[i].equals("that") || str[i].equals("the")){
					return true;
				}
			}
			return false;
		}
		
		int textIndex(char c){
			String text = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
			for(int i=0;i<text.length();i++)if(c == text.charAt(i))return i;
			return -1;
		}
		
	}
}