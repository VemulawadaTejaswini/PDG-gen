
import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()){
			double b = 0;
			int T=in.nextInt();
			StringBuffer a=new StringBuffer(in.next());
			StringBuffer c=new StringBuffer();
			for(int i=0;i<T;i++) {
				c.append(a);
				if(c.charAt(i)==0) {
					c.replace(i, i+1, "1");
				}else {
					c.replace(i, i+1, "0");
				}
				for(int j=0;j<c.length();j++) { //
					b=(b+(c.charAt(j)-48)*Math.pow(2, c.length()-j-1));
				}
				int count1=0;
				while(b!=0) {
					count1++;
					int d=(int) b;
					c.delete(0, c.length());
					while(d!=0) {
						c.append(b%2);
						d/=2;
					}
					int count=0;
					for(int j=0;j<c.length();j++) {
						if(c.charAt(i)-48==1) {
							count++;
						}
					}
					b%=count;
				}
				System.out.println(count1);
			}
		}
	}
}
