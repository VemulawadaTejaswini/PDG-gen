import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;

public class Main {
	static HashMap<String, Integer> map = new HashMap<String, Integer>();
	static int n,m;
	static int[] v,t;
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String a = br.readLine();
		int l = a.length();
		for(int i = 0; i < l; i++){
			char c = a.charAt(i);
			if(c=='0'){
				sb.append(0);
			}else if(c=='1'){
				sb.append(1);
			}else{
				int len = sb.length();
				if(len!=0){
					sb.delete(len-1,len);
				}
			}
		}
		System.out.println(sb);
	}
}