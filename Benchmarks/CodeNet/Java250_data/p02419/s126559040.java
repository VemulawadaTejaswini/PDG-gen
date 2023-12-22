
import java.util.*;

public class Main {
	 
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		String jstr=cin.nextLine();
		List<String> str=new ArrayList<>();
		while(true) {
			String cstr=cin.next();
			if(cstr.indexOf("END_OF_TEXT")>-1)break;
			str.add(cstr);
		}
		
		int res=0;
		//System.out.println(jstr);
		//System.out.println(str);
		
		for(int i=0;i<str.size();i++) {
			//String s=str.substring(i, i+jstr.length());
			if(str.get(i).length()==jstr.length()) {
				if(str.get(i).equalsIgnoreCase(jstr))res++;
			}
		}
		System.out.println(res);
	}
	
	
}
