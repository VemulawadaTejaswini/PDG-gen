
import java.util.*;

public class Main {
	static String change(String str){
		StringBuffer sb = new StringBuffer(str);
		String tmp;
		tmp = sb.reverse().toString();
		return tmp;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Set<String> set = new HashSet<String>();
	int m;
	String str;
	String[] strage = new String[2];
	m = s.nextInt();
	
	while(m-->0){
		str = s.next();
		set.clear();
	for(int i=1;i<str.length();i++){
		strage[0]=str.substring(0, i);
		strage[1]=str.substring(i);

		set.add(strage[0]+strage[1]);
		set.add(strage[1]+strage[0]);
		set.add(change(strage[0])+strage[1]);
		set.add(strage[1]+change(strage[0]));
		set.add(strage[0]+change(strage[1]));
		set.add(change(strage[1])+strage[0]);
		set.add(change(strage[0])+change(strage[1]));
		set.add(change(strage[1])+change(strage[0]));
	}
		System.out.println(set.size());
	}
	s.close();
}
}