import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String str=sc.next();
			String a,b;
			ArrayList<String> list = new ArrayList<String>();
			for(int j=0;j<str.length()-1;j++){
				a=str.substring(0,j+1);
				b=str.substring(j+1);
				StringBuilder rev_a=new StringBuilder(a);
				StringBuilder rev_b=new StringBuilder(b);
				String r_a=new String(rev_a.reverse());
				String r_b=new String(rev_b.reverse());

				list.add(a+b);
				list.add(r_a+b);
				list.add(a+r_b);
				list.add(r_a+r_b);
				list.add(b+a);
				list.add(r_b+a);
				list.add(b+r_a);
				list.add(r_b+r_a);
			}	
			Collections.sort(list);
			String tmp="";int ans=0;
			for (int j=0;j<list.size();j++) {
				if(!list.get(j).equals(tmp)){
					ans++;
					tmp=list.get(j);
				}
				//System.out.println(string);
			}
			System.out.println(ans);
		}
	}
}