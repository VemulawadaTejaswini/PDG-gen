import java.util.*;

class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in); 
		String s=sc.next();
		int i=0;
		if(Integer.parseInt(s)<=(s.charAt(i)-'0')*111)
		    System.out.print((s.charAt(i)-'0')*111);
		else
		    System.out.print((s.charAt(i)-'0'+1)*111);
		
	}
}