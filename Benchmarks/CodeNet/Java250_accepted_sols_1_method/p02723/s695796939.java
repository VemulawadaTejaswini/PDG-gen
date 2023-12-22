import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	char[] s = sc.next().toCharArray();
      	if(s[2]==s[3] && s[4]==s[5]) System.out.println("Yes");
      	else System.out.println("No");
    }
}