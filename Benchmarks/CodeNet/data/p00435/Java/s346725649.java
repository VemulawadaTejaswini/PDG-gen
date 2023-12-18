

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char c;
		for(int i = 0;i < s.length();++i){
			c = s.charAt(i);
			if(c <= 67){
				c+=23;
			}else{
				c-=3;
			}
			System.out.print(Character.toString(c));
		}
	}
}