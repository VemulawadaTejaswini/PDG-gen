import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int q=Integer.parseInt(sc.next());
		int a=0;
		int b=0;
		String c="";
		String f="";
		String x="";
		String y="";
		String p="";
		for(int i=0;i<q;i++){
			String request=sc.next();
			switch(request){
			case "print":
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next())+1;
				System.out.println(str.substring(a,b));
				break;
			case "reverse":
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next())+1;
				c=str.substring(a,b);
				StringBuffer sb=new StringBuffer(c);
				c=sb.reverse().toString();
				x=str.substring(0,a);
				y=str.substring(b,str.length());
				str=x+c+y;
				//System.out.println(str);
				break;
			case "replace":
				a=Integer.parseInt(sc.next());
				b=Integer.parseInt(sc.next())+1;
				p=sc.next();
				x=str.substring(0,a);
				y=str.substring(b,str.length());
				str=x+p+y;
				break;
			}
		}
	}

}

