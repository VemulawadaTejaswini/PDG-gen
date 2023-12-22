import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
 

//result = Math.pow(num1, num3)
//StringBuffer str = new StringBuffer(hoge1);
//String hoge2 = str.reverse().toString();
//map.containsKey(A)

//Map<String, Integer> map = new HashMap<String, Integer>(n);
/*for ( キーのデータ型 key : マップの名前.keySet() ) {
	データのデータ型 data = マップの名前.get( key );
	
	// keyやdataを使った処理;
}*/
//int i = Integer.parseInt(s);

//ArrayList<String> cc = new ArrayList<>(n);
//Collections.sort(list);
//Array.sort(list);
//Arrays.asList(c).contains("a")
//list.set(1,"walk");
public class Main {
	private static Scanner sc = new Scanner(System.in);
	static void p(String ans) {System.out.println(ans);};
	static void p(int ans) {System.out.println(ans);};
	static void p(long ans) {System.out.println(ans);};
	static void p(double ans) {System.out.println(ans);};
	static String s;
	static String g;
	static int a[]=new int[4];
	public static void main(String[] args) {
		int a=0;
		String S=sc.next();
		boolean aa=false;
		if(S.charAt(0)==65) {
			a=S.indexOf("C",2);
			int b=S.lastIndexOf("C",S.length()-2);
			if(a!=-1&&b!=-1) {
				if(a==b) {
					aa=true;
				}
			}
		}
		
		if(aa) {
			boolean wa=false;
			for(int i=0;i<S.length();i++) {
				if(i==0||i==a) {
					
				}else {
					if(!(S.charAt(i)>=97)) {
						wa=true;
					}
				}
				
			}
			if(wa) {
				p("WA");
			}else {
				p("AC");
			}
		}else {
			p("WA");
		}

	}
	static boolean dfs(int b,int sum,String v) {
		g=v;
		if(b==4)return sum==7;
		if(dfs(b+1,sum+a[b],v+"+"))return true;
		if(dfs(b+1,sum-a[b],v+"-"))return true;
		return false;
	}
	

	
	
	
}
