import java.util.*;
import javax.script.*;

class Main{
	public static void main(String[]z){try{
		Scanner x=new Scanner(System.in);
		ScriptEngine y = new ScriptEngineManager().getEngineByName("JavaScript");
		int n=x.nextInt();for(;n>0;n--){
			String s=x.next();
			y.eval("println("+s.substring(0,s.length()-1)+");");
		}
	}catch(Exception e){}}
}