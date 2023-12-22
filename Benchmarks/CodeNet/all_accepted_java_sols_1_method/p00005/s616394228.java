import java.io.*;
import java.util.regex.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Pattern pattern = Pattern.compile("([0-9]+) *([0-9]+)");
		String str = "";
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		while((str=bf.readLine())!=null){
			Matcher matcher = pattern.matcher(str);
			if(!matcher.matches())break;
			int a,b,c,d,e,f;
			a=c=Integer.parseInt(matcher.group(1));
			b=d=Integer.parseInt(matcher.group(2));
			while((c*d)!=0){
				if(c>d)
					c%=d;
				else
					d%=c;
			}
			e=c+d;
			f=a/e*b/e*e;
			System.out.println(""+e+" "+f);
		}
		bf.close();
	}
}