
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String jstr=cin.nextLine();
		String str="";
		while(true) {
			String cstr=cin.nextLine();
			if(cstr.indexOf("END_OF_TEXT")>-1)break;
			str+=cstr;
		}
		
		int res=0;
		
		for(int i=0;i<=str.length()-jstr.length();i++) {
			String s=str.substring(i, i+jstr.length());
			if(s.equalsIgnoreCase(jstr))res++;
		}
		System.out.println(res);
	}
	
	
}
