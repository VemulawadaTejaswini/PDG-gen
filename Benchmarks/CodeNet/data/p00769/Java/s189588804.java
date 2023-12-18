
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	static String str;
	static int s,e;
	
	public static boolean db(int g){
		int m = 0;
		for(int i = g;i < str.length();i++){
			switch(str.charAt(i)){
			case '[':
				if(m > 0)
					s = i-1;
				m++;
				break;
			case ']':
				if(m < 0){
					e = i+1;
					return true;
				}
				m--;
				break;
			default:
				m = 0;
				break;
			}
		}
		return false;
	}
	
	public static void f(){
		if(str.charAt(1) != '[')
			return;
		String sc = "";
		String ms;
		int k;
		s = 0;
		String num = "";
		char c;
		while(db(e)){
			ArrayList<Integer> list = new ArrayList<Integer>();
			ms = str.substring(s,e);
/*			String[] si = ms.substring(2,ms.length()-2).split("\\]\\[");
			for(int i = 0;i < si.length;i++){
				list.add(Integer.valueOf(si[i]));
			}
			Collections.sort(list);
			k = 0;
			for(int i = 0;i < list.size()/2+1;i++){
				k += list.get(i);
			}
			sc = sc + str.substring(s,m.start()) + "[" + k + "]";
			s = m.end();*/
			for(int i = 0;i < ms.length();i++){
				c = str.charAt(i);
				if(0 <= c-'0' && c-'0' <= 9){
					num = num + c;
				}
				else{
					if(!num.isEmpty()){
						list.add(Integer.valueOf(num));
						num = "";
					}
				}
			}
			Collections.sort(list);
			k = 0;
			for(int i = 0;i < list.size()/2+1;i++){
				k += list.get(i);
			}
			sc = sc + str.substring(s,e) + "[" + k + "]";
		}
		sc = sc + str.substring(e,str.length());
		str = sc;
		f();
	}
	
	public static void fs(){
	/*	int s = 0;
		String sc = "";
		String ms;
		Pattern p = Pattern.compile("\\[\\d*\\]");
		Matcher m = p.matcher(str);
		while(m.find()){
			ms = m.group();
			sc = sc + str.substring(s,m.start()) + "[" + (Integer.valueOf(ms.substring(1,ms.length()-1))/2+1) + "]";
			s = m.end();
		}
		sc = sc + str.substring(s,str.length());
		str = sc;*/
		String sc = "";
		char c;
		String num = "";
		for(int i = 0;i < str.length();i++){
			c = str.charAt(i);
			if(0 <= c-'0' && c-'0' <= 9){
				num = num + c;
			}
			else{
				if(!num.isEmpty()){
					sc = sc + (Integer.valueOf(num)/2+1);
					num = "";
				}
				sc = sc + c;
			}
		}
		str = sc;
	}
	
	public static void main(String[] args) {
		int n;
		Scanner in = new Scanner(System.in);
		for(n = Integer.valueOf(in.nextLine());n > 0;n--){
			str = in.nextLine();
			fs();
			f();
			System.out.println(str.substring(1,str.length()-1));
		}
	}

}