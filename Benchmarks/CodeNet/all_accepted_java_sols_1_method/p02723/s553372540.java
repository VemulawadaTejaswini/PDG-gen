import java.util.Scanner;

public class Main{ public static void main(String...args){
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    if(S.length() < 6) System.out.print("No");
  	else{
      if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)) System.out.print("Yes");
      else System.out.print("No");}
	}
}