import java.io.*;
import java.math.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		Scanner r = new Scanner(System.in);
		String str;
		char[] c;
		int flag;
		int ans=0;
		while(r.hasNext()){
			flag=0;
			str = r.next();
			c =str.toCharArray();
			if(str.length() == 1) ans++;
			else{
				for(int i=0;i<str.length()/2;i++){
					if(c[i]==c[str.length()-1-i])continue;
					else {
						flag=1;
						break;
					}
				}
				if(flag == 0 )ans++;
			}
		}
		System.out.println(ans);
	}
}