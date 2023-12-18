import java.util.*;
class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String t=s.next(),u="",v="";
		int r=0;
		for(int i=0;i<t.length();++i) {
			v+=t.charAt(i);
			if(!u.equals(v)){
				u=v;
				v="";
				++r;
			}
		}
		System.out.println(r);
	}
}
