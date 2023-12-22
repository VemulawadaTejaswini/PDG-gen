import java.util.*;
public class Main {
    public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
      int k = scan.nextInt();
      String s = scan.next();
      StringBuffer sb = new StringBuffer();
      for (int i = 0; i < s.length(); i++) {
        char temp = s.charAt(i);
        if(i==k-1) {
          temp = (char)(temp+32);
        }
        sb.append(temp);
      }
      
			System.out.println(sb.toString());
    }
}
