import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		while(s.hasNext()){
			String a=s.next();
			String b=s.next();
			if(a.length()>b.length()){
				String c=a;
				a=b;
				b=c;
			}
			int ret=0;
			for(int i=0;i<a.length();i++){
				int now=0;
				int temp=0;
				for(int j=0;j<a.length()&&j+i<b.length();j++){
					if(a.charAt(j)==b.charAt(j+i))temp++;
					else{
						now=Math.max(now,temp);
						temp=0;
					}
				}
				now=Math.max(now,temp);
				ret=Math.max(now,ret);
				//System.out.println(now);
			}
			String d=a;
			a=b;
			b=d;
			for(int i=0;i<a.length();i++){
				int now=0;
				int temp=0;
				for(int j=0;j<a.length()&&j+i<b.length();j++){
					if(a.charAt(j)==b.charAt(j+i))temp++;
					else{
						now=Math.max(now,temp);
						temp=0;
					}
				}
				now=Math.max(now,temp);
				ret=Math.max(now,ret);
				//System.out.println(now);
			}
			
			System.out.println(ret);
		}
	}
}