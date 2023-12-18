import java.util.*;

public class Main {
	String s, t;
	int n;
	
	void func(){
		boolean flag;
		int min = 0;
		String v = s;
		String u = s;
		StringBuffer cc;
		int id, p, q, r, t;
		while(true){
			p = s.indexOf(')');
			q = s.lastIndexOf('(', p);
			r = p;
			if(r==-1) r = s.length();
			
			flag = false;
			for(int i=min;i<r;i++){
				min = i;
				if(Character.isUpperCase(s.charAt(i))==true){
					if(i==0 || Character.isUpperCase(s.charAt(i-1))==false){
						if(i==s.length()-1 || Character.isUpperCase(s.charAt(i+1))==false){
							p = i;
							flag = true;
							break;
						}
					}
				}
			}
			
			if(p==-1) break;
			
			if(flag==false){
				u = s.substring(q+1, p);
			}else{
				u = s.substring(p,p+1);
				q = p;
			}
			
			id = q-1;
			while(id!=-1 && 48<=s.charAt(id) && s.charAt(id)<=57) id--;
			id++;
			v = s.substring(id, q);
			if(v.length()>0) r = Integer.valueOf(v);
			else r = 1;
			
			t = id;
			id--;
			while(id!=-1 && 65<=s.charAt(id) && s.charAt(id)<=90) id--;
			id++;
			
			cc = new StringBuffer(s.substring(0,t));
			for(int i=0;i<r;i++) cc.append(u);
			s = cc.append(s.substring(p+1, s.length())).toString();
			
			if(flag==true) q-=2;
			v = s.substring(id, t+(p-q-1)*r);
			if(v.length()>n) break;
		}
		if(v.length()>n) System.out.println(s.charAt(n));
		else System.out.println(0);
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			s = sc.next();
			n = sc.nextInt();
			if(s.compareTo("0")==0 && n==0) break;
			func();
		}
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}