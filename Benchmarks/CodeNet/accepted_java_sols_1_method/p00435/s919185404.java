import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in); //scanの宣言
        
        String str;  //文字列変数の宣言
        
        str = sc.next(); //input
        
        for(int i = 0; i < str.length(); i++){
			System.out.print((char)((str.charAt(i) - 'A' - 3 + 26) % 26 + 'A'));
		}
		
		System.out.println(); //print
        
    }
}

