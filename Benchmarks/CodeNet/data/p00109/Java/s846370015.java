import java.util.*;
import java.util.regex.*;

class Main{
	static Pattern parens = Pattern.compile("(.*?)\\((.+)\\)(.*)");
	static Pattern add = Pattern.compile("(.*?)(\\d+)\\+(\\d+)(.*)");
	static Pattern sub = Pattern.compile("(.*?)(\\d+)\\-(\\d+)(.*)");
	static Pattern mul = Pattern.compile("(.*?)(\\d+)\\*(\\d+)(.*)");
	static Pattern div = Pattern.compile("(.*?)(\\d+)\\/(\\d+)(.*)");

	static String process(String s){
		Matcher m=parens.matcher(s);
		if(m.find()){
			s=m.group(1)+process(m.group(2))+m.group(3);
		}
		m=mul.matcher(s);
		while(m.find()){
			s=m.group(1)+(Integer.parseInt(m.group(2))*Integer.parseInt(m.group(3)))+m.group(4);
			m=mul.matcher(s);
		}
		m=div.matcher(s);
		while(m.find()){
			s=m.group(1)+(Integer.parseInt(m.group(2))/Integer.parseInt(m.group(3)))+m.group(4);
			m=div.matcher(s);
		}
		m=add.matcher(s);
		while(m.find()){
			s=m.group(1)+(Integer.parseInt(m.group(2))+Integer.parseInt(m.group(3)))+m.group(4);
			m=add.matcher(s);
		}
		m=sub.matcher(s);
		while(m.find()){
			s=m.group(1)+(Integer.parseInt(m.group(2))-Integer.parseInt(m.group(3)))+m.group(4);
			m=sub.matcher(s);
		}
		return s;
	}

	public static void main(String[]z){
		Scanner x=new Scanner(System.in);
		int n=x.nextInt();for(;n>0;n--){
			String s=x.next();
			System.out.println(process(s.substring(0,s.length()-1)));
		}
	}
}