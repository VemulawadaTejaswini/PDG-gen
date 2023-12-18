
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
		
		int i=0,res=0;
		
		while(true) {
			int idx=str.indexOf(jstr);
			if(str.length()<jstr.length() || idx==-1)break;
			
			res++;
			str=str.substring(idx+jstr.length(), str.length());
		}
		System.out.println(res);
	}
	
	
}
