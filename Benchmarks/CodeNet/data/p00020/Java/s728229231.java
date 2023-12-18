import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    char[] s=sc.nextLine().toCharArray();
	    for(int i=0;i<s.length;i++)s[i]=Character.toUpperCase(s[i]);
	    System.out.println(s);
	}
}
//by Tuvshee 12.05.2012
//Capitalize