import java.util.*;
public class Main {
	public static void main(String[] args) { 
		try(Scanner sc=new Scanner(System.in)){
			String line=sc.nextLine();
			String answer="";
			int length=line.length();
			for(int i=0;i<length;i++) {
				char ch=line.charAt(i);
				if(Character.isLowerCase(ch)) {
					answer+=Character.toUpperCase(ch);
				}else if(Character.isUpperCase(ch)) {
					answer+=Character.toLowerCase(ch);
				}else {
					answer+=ch;
				}
			}
			System.out.println(answer);
		}
	}
}
