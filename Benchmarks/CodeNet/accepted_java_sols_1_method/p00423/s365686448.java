import java.util.*;
class Main{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args){
		int sca=0,scb=0,a,b,x;
		while((x=Integer.parseInt(s.next()))!=0) {
			sca=0;scb=0;a=0;b=0;
			for(int i=x;i>0;--i) {
				a=Integer.parseInt(s.next());
				b=Integer.parseInt(s.next());
				if(a>b) {
					sca+=a+b;
				}else if(a<b) {
					scb+=a+b;
				}else {
					sca+=a;
					scb+=b;
				}
			}
			System.out.printf("%d %d\n",sca,scb);
		}
	}
}