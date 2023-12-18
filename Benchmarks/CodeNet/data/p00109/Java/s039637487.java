import java.util.*;
import java.util.regex.*;
import javax.script.*;

class Main{
	public static void main(String[]z){try{
		Scanner x=new Scanner(System.in);
		ScriptEngine y = new ScriptEngineManager().getEngineByName("JavaScript");
		Pattern p = Pattern.compile("(.*?)(\\d+)\\/(\\d+)(.*)");

		int n=x.nextInt();for(;n>0;n--){
			String s=x.next();
			Matcher m=p.matcher(s);
			while(m.find()){
				s=m.group(1)+(Integer.parseInt(m.group(2))/Integer.parseInt(m.group(3)))+m.group(4);
				m=p.matcher(s);
			}
			y.eval("println("+s.substring(0,s.length()-1)+");");
		}
	}catch(Exception e){}}
}