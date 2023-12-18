import java.util.*;
class Main{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in);
	  String S = scan.next();
      String N = "";
      int num = 0;
      for(int i = S.length(); i > 0; i--){
        N = S.substring(i-1, i);
        num += Integer.parseInt(N);
      }
      if(num%9==0) System.out.println("Yes");
      else System.out.println("No");
	}
}