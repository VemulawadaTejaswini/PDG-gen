/* http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0501 */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(r.readLine());
			if(n==0){ break; }
			
			Map<String,String> map = new HashMap<String,String>();
			for(int i=0;i<n;i++){
				String[] k = r.readLine().split(" ");
				map.put(k[0],k[1]);
			}
			
			int m = Integer.parseInt(r.readLine());
			for(int i=0;i<m;i++){
				String s = r.readLine();
				String s2 = map.get(s);
				if(s2!=null) s = s2;
				
				System.out.print(s);
			}
			System.out.println();
		}
	}
}