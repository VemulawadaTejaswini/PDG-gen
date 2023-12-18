import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.nextLine();
		String t = sc.nextLine();
		int a = 0;
		// スペース区切りの整数の入力
		int b = t.length();
		for(int i = 0; i < s.length() - t.length() + 1; i++){
			for(int j = 0;j < t.length();j++){
				if(!s.substring(i + j, i + j + 1).equals(t.substring(j, j + 1))){
					a ++;
				}
			}
			if(b > a){
				b = a;
			}
			a = 0;
		} 
		System.out.println(b);
		
		
	}
}