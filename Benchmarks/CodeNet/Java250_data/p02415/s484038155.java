import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;
public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn=new Scanner(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s=stdIn.nextLine();
		String ans="";
		for(int i=0;i<s.length();i++){
			char tmp=s.charAt(i);
			if('A'<=tmp&&tmp<='Z')
				ans+=(char)(tmp-'A'+'a');
			else if('a'<=tmp&&tmp<='z')
				ans+=(char)(tmp-'a'+'A');
			else
				ans+=tmp;
		}
		System.out.println(ans);
	}
}