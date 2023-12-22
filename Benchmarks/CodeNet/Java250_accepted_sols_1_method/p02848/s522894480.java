import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
		//sc.nextLine();
		
		int l = s.length();
		char[] str = new char[l];
		for(int i = 0; i < l; i++){
			int a = s.charAt(i) + n;
			if(a > 90){
				str[i] = (char)(s.charAt(i) + n - 26);
			}else{
			str[i] = (char)(s.charAt(i) + n);
			}
		}
		for(int i = 0; i < l; i++){
			System.out.print(str[i]);
		}
	}
		
		
}