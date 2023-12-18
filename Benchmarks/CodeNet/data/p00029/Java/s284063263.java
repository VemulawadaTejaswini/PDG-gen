
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> h = new HashMap<String,Integer>();
		String a[] = new String[1000];
		int I = 0;
		int maxlength = 0;
		String maxleng = "";
		while(sc.hasNext()){
			String str = sc.next();
			if(maxlength < str.length()){
				maxlength = str.length();
				maxleng = str;
			}
			if(h.containsKey(str)){
				int c = h.get(str).intValue();
				h.put(str,Integer.valueOf(c+1));
			}
			else{
				h.put(str,Integer.valueOf(1));
				a[I++] = str;
			}
		}
		int maxval = 0;
		String maxVal = "";
		for(int i=0;i<I;i++){
			if(h.get(a[i]).intValue() > maxval){
				maxval = h.get(a[i]).intValue();
				maxVal = a[i];
			}
		}
		System.out.println(maxVal+" "+maxleng);
	}
}
