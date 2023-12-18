import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String input = n.nextLine();
		StringBuilder in = new StringBuilder(input);//inに移し替える。
		for(int i=0;i<input.length();i++){
			char work = in.charAt(i);
			if(Character.isLowerCase(work)){
				in.setCharAt(i,Character.toUpperCase(work));
			}else if(Character.isUpperCase(work)){
				in.setCharAt(i,Character.toLowerCase(work));
			}
		}
		System.out.println(in);
	}
}