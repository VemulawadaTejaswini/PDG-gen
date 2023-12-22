import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char[] ch = str.toCharArray();
 
        if (ch[0] == ch[1] && ch[0] == ch[1] && ch[0] == ch[3]) {

          System.out.println("No");
          
        } else if ( (ch[0] == ch[1] && ch[2] == ch[3]) ||
                    (ch[0] == ch[3] && ch[1] == ch[2]) ||
                    (ch[0] == ch[2] && ch[1] == ch[3]) ) {
          
          System.out.println("Yes");
            
        } else {
          System.out.println("No");
        }
	}
}