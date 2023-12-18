import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader r =
			new BufferedReader(new InputStreamReader(System.in),1);
			Stack<Integer> ans = new Stack<Integer>();
			//System.out.flush();
			String s =r.readLine();
			int n = Integer.parseInt(s);
			int maxlength;
			int digit,updigit;
			char ar[]={'0'};
			char br[]={'0'};
			int j,i;
		
			for(i=0;i<n;i++){
				ans.clear();
				String as = r.readLine();
				String bs = r.readLine();
				char a[] = as.toCharArray();
				char b[] = bs.toCharArray();
				//for(j=0; j<a.length; j++) ar[j] = a[a.length-1-j];
				//for(j=0; j<a.length; j++) br[j] = b[b.length-1-j];
				if(a.length > b.length) maxlength = a.length;
				else maxlength = b.length;
				updigit = 0;
				digit = 0;


				for(j=0;j<maxlength;j++){
					if(j < a.length && j < b.length){
						digit = (int)a[a.length-1-j] + (int)b[b.length-1-j] - 96 + updigit;
					}else if(j < a.length){
						digit = (int)a[a.length-1-j] - 48 + updigit;
					}else{
						digit = (int)b[b.length-1-j] - 48 + updigit;
					}
					updigit = 0;
					if(digit >= 10){
						digit -= 10;
						updigit = 1;
					}
					ans.push(digit);
				}
				if(updigit >= 1) ans.push(updigit);
				if (ans.size()>80) System.out.print("OverFlow");
				else while(!ans.empty()) System.out.print(ans.pop());
				//System.out.println("");
			}
	}
}