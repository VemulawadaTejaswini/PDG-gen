import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		int a=s.nextInt();
		int ans=0;
		for(int i=0;i<a;i++){
			boolean ok=false;
			String val=s.next();
			for(int j=0;j<val.length()+str.length();j++){
				boolean now=true;
				for(int k=0;k<str.length();k++){
					if(val.charAt((j+k)%val.length())!=str.charAt(k))
						now=false;
				}
				if(now)ok=true;
			}
			if(ok)ans++;
		}
		System.out.println(ans);
	}
}