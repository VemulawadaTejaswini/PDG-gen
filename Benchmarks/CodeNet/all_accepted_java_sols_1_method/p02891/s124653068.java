import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		long k=sc.nextLong();
		if(s.length()==1) {
			System.out.println(k/2);

			return;
		}

		char a=s.charAt(0);
		Boolean kaeta[]=new Boolean[s.length()];
		long cnt=0;
		kaeta[0]=false;
		int first=1;
		Boolean tmp=true;
		for(int i=1;i<s.length();i++) {
			char b=s.charAt(i);
			if(b==a&&!kaeta[i-1]) {
				cnt++;
				kaeta[i]=true;
			}else {
				kaeta[i]=false;
			}
			if(b==a&&first==i) {
				//tmp=false;
				first++;
			}else {
				tmp=false;
			}
			a=b;
		}
		int last=1;
			char l=s.charAt(s.length()-1);
			//System.out.println(l);
			for(int i=s.length()-2;i>=0;i--) {
				char r=s.charAt(i);
				//System.out.println(r);
				if(r==l) {
					last++;
				}else {
					break;
				}
			}
		//System.out.println(first+" "+last);
		//System.out.println(cnt);
		if(a==s.charAt(0)&&!kaeta[s.length()-1]&&tmp) {

			if(k%2==0) {
				cnt=cnt*2+1;
				System.out.println(cnt*k/2);

			}else {
				//System.out.println(cnt+" "+k);
				System.out.println((cnt*2+1)*(k/2)+cnt);
			}
			return;

		}
		if(a==s.charAt(0)&&!kaeta[s.length()-1]&&!tmp&&(first+last)%2==0) {

			if(k==1) {
				System.out.println(cnt);
			}else {
				//System.out.println();
				System.out.println((cnt+1)*k-1);
			}
			return;

		}

		cnt*=k;

		System.out.println(cnt);
	}
}
