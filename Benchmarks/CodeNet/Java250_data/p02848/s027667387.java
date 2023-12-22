import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// スペース区切りの整数の入力
		String f = sc.next();
		String[] g = new String[] {"A", "B", "C", "D" , "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
		
		// 文字列の入力
		String h ="";
		for(int i = 0; i < f.length(); i++){
			for(int j = 0; j < 26; j++){
				if(f.substring(i, i + 1).equals(g[j])){
					h = h + g[((j + a) % 26)];
                  // System.out.println(j);
				}
              // System.out.println(f.substring(i, i + 1));
                
			}
              
		} 
		
		System.out.println(h);
		
		
	}
}