import java.util.*;

public class Main {
	String s, t;
	int n;
	
	void func(){
		String v = s;
		String u = s;
		int id;
		int t;
		while(true){
			int p = s.indexOf(')');
			int q = s.lastIndexOf('(', p);
			if(p==-1) break;
			
			u = s.substring(q+1, p);
			id = q-1;
			while(id!=-1 && Character.isDigit(s.charAt(id))==true) id--;
			id++;
			int r;
			v = s.substring(id, q);
			if(v.length()>0) r = Integer.valueOf(v);
			else r = 1;
			
			t = id;
			id--;
			while(id!=-1 && Character.isUpperCase(s.charAt(id))==true) id--;
			id++;
			v = s.substring(id, t);
			
			StringBuffer cc = new StringBuffer(s.substring(0,t));
			for(int i=0;i<r;i++) cc.append(u);
			s = cc.append(s.substring(p+1, s.length())).toString();
			
			v = s.substring(id, t+(p-q-1)*r);
			if(v.length()>n) break;
		}
		if(v.length()>n) System.out.println(s.charAt(n));
		else System.out.println(0);
	}
	
	
	void tf(){
		StringBuffer bb;
		for(int i=0;i<s.length();i++){
			if(Character.isUpperCase(s.charAt(i))==true){
				if(i==0 || Character.isUpperCase(s.charAt(i-1))==false){
					if(i==s.length()-1 || Character.isUpperCase(s.charAt(i+1))==false){
						bb = new StringBuffer();
						bb.append(s.substring(0, i)).append('(').append(s.charAt(i)).append(')').append(s.substring(i+1, s.length()));
						s = bb.toString();
						i+=2;
					}
				}
			}
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			s = sc.next();
			n = sc.nextInt();
			if(s.compareTo("0")==0 && n==0) break;
			tf();
			func();
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}