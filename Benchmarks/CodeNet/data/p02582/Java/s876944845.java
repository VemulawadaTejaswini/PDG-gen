import java.util.*;
public class Main {
	public static void main(String[] args){
		// 文字列の入力
		String someString = "RRS";
		char rChar = 'R';
        int rCount = 0;
      
		for (int i = 0; i < someString.length(); i++) {
        if (someString.charAt(i) == rChar) {
        rCount++;
        }         
        }
      
      System.out.println(rCount);
      
	}
}