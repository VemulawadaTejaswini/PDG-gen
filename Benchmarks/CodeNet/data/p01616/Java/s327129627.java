import java.util.*;

public class Main {
	String s;
	boolean flag;
	ArrayList<String> list, orlist;
	
	
	void checkA(){
		if(flag==true){
			if(s.indexOf('#')!=-1){
				orlist.add(s);
			}else if(s.indexOf('&')!=-1){
				String[] t = s.split("&");
				for(int i=0;i<2;i++){
					list.add(t[i]);
					if(t[i].charAt(0)=='~')	t[i] = t[i].substring(1,t[i].length());
					else t[i] = "~" + t[i];
					if(list.contains(t[i])==true) flag = false;
				}
			}else{
				list.add(s);
				if(s.charAt(0)=='~') s = s.substring(1,s.length());
				else s = "~" + s;
				if(list.contains(s)==true) flag = false;
			}
		}
	}
	
	void checkB(){
		for(int i=0;i<orlist.size();i++){
			String[] t = orlist.get(i).split("#");
			for(int j=0;j<2;j++){
				if(t[j].charAt(0)=='~') t[j] = t[j].substring(1,t[j].length());
				else t[j] = "~" + t[j];	
			}
			if(list.contains(t[0])==true && list.contains(t[1])==true){
				flag = false;
				break;
			}
		}
	}
	
	void func(){
		while(true){
			int p = s.indexOf(')');
			int q = s.lastIndexOf('(', p);
			if(p==-1) break;
			String r = s.substring(q+1,p);
			StringBuffer sb = new StringBuffer();
			if(r.indexOf('#')!=-1 && q>0 && s.charAt(q-1)=='~') r = r.replaceAll("#", "&~");
			else if(r.indexOf('&')!=-1 && q>0 && s.charAt(q-1)=='~') r = r.replaceAll("&", "#~");
			sb.append(s.substring(0,q)).append(r).append(s.substring(p+1,s.length()));
			s = sb.toString().replaceAll("~~", "");
		}
	}
	
	void solve(){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		list = new ArrayList<String>();
		orlist = new ArrayList<String>();
		flag = true;
		for(int i=0;i<n;i++){
			s = sc.next().replaceAll("~~", "").replace('|', '#').replaceFirst(";","");
			func();
			checkA();
		}
		if(flag==true) checkB();
		if(flag==true) System.out.println("accept");
		else System.out.println("reject");
	}
	
	public static void main(String[] args) {
		new Main().solve();
	}	
}