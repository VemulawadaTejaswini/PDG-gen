
import java.util.*;

public class Main {
	static String change(String str){
		String tmp="";
		for(int i=str.length()-1;i>=0;i--){
			tmp +=str.charAt(i);
		}
		return tmp;
	}
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	Set set = new HashSet();
	int m;
	String str;
	String[] strage = new String[2];
	m = s.nextInt();
	
	while(m-->0){
		str = s.next();
		set.clear();
	for(int i=0;i<str.length();i++){
		strage[0]="";
		strage[1]="";
		for(int j=0;j<str.length();j++){
			if(j<=i) strage[0]+=str.charAt(j);
			else strage[1]+=str.charAt(j);
		}
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