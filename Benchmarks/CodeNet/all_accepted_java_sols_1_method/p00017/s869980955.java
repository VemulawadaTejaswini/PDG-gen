import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str;
		while(sc.hasNextLine()){
			str = sc.nextLine();
			while(true){
				char[] chars = new char[str.length()+1];
				chars = str.toCharArray();
				for(int i = 0; i < str.length(); i++){
					if(chars[i] == 'Z'){
						chars[i] = 'A';
					}else if(chars[i] == 'z'){
						chars[i] = 'a';
					}else if('a' <= chars[i] && chars[i] <= 'z' || 'A' <= chars[i] && chars[i] <= 'Z'){
						chars[i]++;
					}
				}
				str = String.valueOf(chars);
				if(str.indexOf("the") != -1 || str.indexOf("that") != -1 || str.indexOf("this") != -1){
						break;
				}
			}
			System.out.println(str);
		}
	}
}