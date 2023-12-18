import java.io.*;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader bf =new BufferedReader(new InputStreamReader(System.in));
		String t;
		while((t=bf.readLine())!=null){
			String m = "(.* )?th(e|is|at) .*",em="",dec="";
			int n,c=0;
			for(n=0;n<26;n++){
				em="";for(int i=0;i<m.length();i++){c=m.charAt(i);em+=(char)((c>=97&&c<=123)?(((c-71+n)%26)+97):(c));}
				if(((Pattern.compile(em)).matcher(t)).matches())break;
			}
			for(int i=0;i<t.length();i++){c=t.charAt(i);c=(c>=97&&c<=123)?(((c-71-n)%26)+97):(c);dec+=(char)c;}
			System.out.println(dec);
		}
	}
}