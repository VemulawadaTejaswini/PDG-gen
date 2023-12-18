import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String a = sc.next();
        String s[] = a.split("");
        char[] c = a.toCharArray();
        int i;
        int count = 0;
        int check = 0;
        if(!s[0].equals("A")){
          System.out.println("WA");
          System.exit(0);
        }
        for(i = 1;i < a.length(); i++){
          if(Character.isUpperCase(c[i])) {
   			 count += 1;
		  }
          if(s[i].equals("C") && i > 1 && i < a.length() - 1){
             check += 1;
          }
        }
        if(count == 1 && check == 1){
          System.out.println("AC");
          System.exit(0);
        }
		
 		System.out.println("WA");
    }
}