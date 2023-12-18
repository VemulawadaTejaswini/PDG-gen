import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		String S=sc.next();
		int x=0;
		int y=0;
		for(int i=0;i<S.length();i++) {
			String c=S.substring(i,i+1);
			if(c.equals("I")) {
				x++;
				if(x>y) {
					y=x;
				}
			}else {
				x--;
				if(x>y) {
					y=x;
				}
			}
		}
		System.out.println(y);
	}

}
