import java.util.Scanner;

public class Main{

	static final Scanner s=new Scanner(System.in);

	public static void main(String args[]){
		int t=0,h=0;
		String st,sh;
		for(int i=s.nextInt();i>0;i--) {
			st=s.next();
			sh=s.next();
			if(st.compareTo(sh)>0)
				t+=3;
			else if(st.compareTo(sh)<0)
				h+=3;
			else {
				t++;
				h++;
			}
		}
		System.out.printf("%d %d\n",t,h);
	}
}