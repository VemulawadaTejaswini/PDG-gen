import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String word = sc.next();
        String s[] = word.split("");
        int ret = word.length() / 2;
        String front = "",back = "";

      
        StringBuffer str = new StringBuffer(word);
        String reverse = str.reverse().toString();
        if(!word.equals(reverse)){
          System.out.println("No");
          return;
        }
              
        for(int i = 0;i < ret;i++){
          front += s[i];
        }
		str = new StringBuffer(front);
        reverse = str.reverse().toString();      
        if(!front.equals(reverse)){
          System.out.println("No");
          return;
        }        
      
        for(int i = ret + 1;i < word.length();i++){
          back += s[i];
        }
		str = new StringBuffer(back);
        reverse = str.reverse().toString();      
        if(!back.equals(reverse)){
          System.out.println("No");
          return;
        }       
        
        System.out.println("Yes");
    }
}