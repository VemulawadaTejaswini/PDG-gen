import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
      	String str1 = sc.next();
        char[] ch1 = getChars(str1);
      	String str2 = sc.next();
      	char[] ch2 = getChars(str2);

      	int count = 0;
      	for (int i=0; i<str1.length(); i++) {
          if(ch1[i] != ch2[i]) {
            count++;
          }
        }

      	System.out.println(count);
    }
  
  	public static char[] getChars(String str) {
      	char[] ch = new char[str.length()];
      	for (int i=0; i<str.length(); i++) {
            ch[i] = str.charAt(i);
        }
      	return ch;
    }
}