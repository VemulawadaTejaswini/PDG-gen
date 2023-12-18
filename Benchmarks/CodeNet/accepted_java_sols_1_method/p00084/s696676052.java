import java.util.*;
import java.util.regex.*;

class Main{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		
		Pattern p=Pattern.compile("[ .,]");
		boolean first=true;
		while(s.hasNext()){
			String a=s.next();
			String[] b=p.split(a);
			for(int i=0;i<b.length;i++)if(b[i].length()>2&&b[i].length()<7){
				if(!first)System.out.print(" ");
				else first=false;
				System.out.print(b[i]);
			}
		}
		System.out.println();
	}
}