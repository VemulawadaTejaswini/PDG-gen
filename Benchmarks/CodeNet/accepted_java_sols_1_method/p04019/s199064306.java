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
		int l = a.length();
		boolean n=false,s=false,w=false,e=false;
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='N'){
				n=true;
			}
			if(c=='S'){
				s=true;
			}
			if(c=='E'){
				e=true;
			}
			if(c=='W'){
				w=true;
			}
		}
		if(n==s && e==w){
			sb.append("Yes");
		}else{
			sb.append("No");
		}
		System.out.println(sb);
	}
}