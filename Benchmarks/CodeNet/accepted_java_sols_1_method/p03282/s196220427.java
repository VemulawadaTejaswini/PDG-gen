import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		String amj=sc.next();
		long s1=0;
		long mojisu=sc.nextLong();
		long mj=0;
		for(int i=0; i<amj.length(); i++) {
			if(amj.charAt(i)!='1') {
				if(s1>0) {
					mj=Long.parseLong(amj.charAt(Math.min(((int)s1) ,amj.length()-1))+"");
				}
				else {
					mj=Long.parseLong(amj.charAt(0)+"");
				}
				break;
			}
			else {
				s1++;
			}
		}

		if(mojisu>s1) {
			System.out.println(mj);
		}
		else {
			System.out.println(1);
		}
	}
}