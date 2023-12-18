import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		String[] b = new String [1000];
		for(int i = 0;i <= a;i++){
			String str = br.readLine();
			int j = 0;
			for(int Len = 1;Len < str.length();Len++){
				String str2 = str.substring(0,Len);
				String str3 = str.substring(Len,str.length());
				StringBuilder str4 = new StringBuilder(str2);
				str4.reverse();
				String rev = new String(str4);
				StringBuilder str5 = new StringBuilder(str3);
				str5.reverse();
				String rev2 = new String(str5);
				b[j] = str2 + str3;
				b[j+1] = str2 + rev2;
				b[j+2] = rev + str3;
				b[j+3] = rev + rev2;
				StringBuilder rev3 = new StringBuilder(b[j]);
				rev3.reverse();
				b[j+4] = new String(rev3);
				StringBuilder rev4 = new StringBuilder(b[j+1]);
				rev4.reverse();
				b[j+5] = new String(rev4);
				StringBuilder rev5 = new StringBuilder(b[j+2]);
				rev5.reverse();
				b[j+6] = new String(rev5);
				StringBuilder rev6 = new StringBuilder(b[j+3]);
				rev6.reverse();
				b[j+7] = new String(rev6);
				j = j + 8;
			}
			HashSet<String> set= new HashSet<String>();
			for(int k = 0;k < (str.length() - 1) * 8;k++){
				set.add(b[k]);
			}
			Iterator it = set.iterator();
			System.out.println(set.size());
			if(i == a - 1) System.exit(1);
		}
	}
}