
import static java.lang.System.in;
import static java.lang.System.out;
import static java.lang.Math.*;

import java.util.*;


public class Main {

	public static Scanner sc=new Scanner(in);


	static boolean next_permutation(int[]as) {//早い
		int n = as.length;
		for (int i = n - 1; i > 0; i--) {
			if (as[i - 1] < as[i]) {
				int j = n;
				while (as[i - 1] >= as[--j]);
				swap(as, i - 1, j);
				reverse(as, i, n);
				return true;
			}
		}
		return false;
	}
	static void swap(int[] is, int i, int j) {
		int t = is[i];
		is[i] = is[j];
		is[j] = t;
	}
	static void reverse(int[] is, int s, int t) {
		while (s < --t) swap(is, s++, t);
	}

	public void run(){
		while(true){
			int n=sc.nextInt();
			if(n==0)return;
			String[] ss=new String[n];
			for(int i=0;i<n;i++)ss[i]=sc.next();
			int[] per=new int[n];
			for(int i=0;i<n;i++)per[i]=i;

			String mins="";
			for(int i=0;i<200;i++)mins+="-";//INF length

			do{
				String tmp="";
				sl:for(int i=0;i<n;i++){
					if(tmp.contains(ss[per[i]]))continue;
					for(int l=ss[per[i]].length()-1;l>=0;l--){
						if(tmp.endsWith(ss[per[i]].substring(0,l))){
							tmp+=ss[per[i]].substring(l);
							continue sl;
						}
					}
					tmp+=ss[per[i]];
				}
				if(mins.length()>tmp.length())
					mins=tmp;
			}while(next_permutation(per));

			ln(mins);
		}

	}

	public static void main(String[] args) {
		new Main().run();
	}

	//output lib
	public static void ln(){
		out.println();
	}
	public static void pr(Object obj){
		out.print(str(obj));
	}
	public static void ln(Object obj){
		pr(obj);ln();
	}
	public static String str(Object obj){
		return obj.toString();
	}
	public static <E> String str(E[] obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.length;i++){
			sb.append(i==0?"":" ").append(obj[i]);
		}
		return sb.toString();
	}
	public static <E> String str(List<E> obj){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<obj.size();i++){
			sb.append(i==0?"":" ").append(obj.get(i));
		}
		return sb.toString();
	}


}