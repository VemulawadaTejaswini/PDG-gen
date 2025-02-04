import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
 
public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		String b = br.readLine();
		String c = br.readLine();
		String turn = a;
		a = a.substring(1,a.length());
		while(true){
			char ch = turn.charAt(0);
			if(ch=='a'){
				turn = a;
				if(turn.length()==0){
					sb.append('A');
					break;
				}
				a = a.substring(1,a.length());
			}else if(ch=='b'){
				turn = b;
				if(turn.length()==0){
					sb.append('B');
					break;
				}
				b = b.substring(1,b.length());
			}else if(ch=='c'){
				turn = c;
				if(turn.length()==0){
					sb.append('C');
					break;
				}
				c = c.substring(1,c.length());
			}
		}
		System.out.print(sb);
	}
}