import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int q=Integer.parseInt(sc.next());
		int a=0;
		int b=0;
		String x="";
		String y="";
		String z="";
		String newy="";
		for(int i=0;i<q;i++) {
			String quest=sc.next();
			newy="";
			if(quest.equals("replase")) {
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next());
				x=str.substring(0,a);
				y=str.substring(a,b);
				z=str.substring(b,quest.length());
				for(int j=0;j<y.length();j++) {
					newy+="p";
				}
				str=x+newy+z;
			}else if(quest.equals("reverse")) {
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next());
				x=str.substring(0,a);
				y=str.substring(a,b);
				z=str.substring(b,quest.length());
				StringBuffer sb = new StringBuffer(y);
				y = sb.reverse().toString();
				str=x+y+z;
			}else if(quest.equals("print")) {
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next());
				y=str.substring(a,b);
				System.out.println(y);
			}
		}
		//System.out.println(str);
	}

}

