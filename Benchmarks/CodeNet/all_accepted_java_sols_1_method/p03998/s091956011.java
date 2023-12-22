import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.next(),b=sc.next(),c=sc.next();
		String pre="a";
		for(;;) {
			if(pre.equals("a")) {

				if(a.length()==0) {
					System.out.println("A");
					break;
				}else {
					pre=a.charAt(0)+"";
					a=a.substring(1);
				}
			}else if(pre.equals("b")) {

				if(b.length()==0) {
					System.out.println("B");
					break;
				}else {
					pre=b.charAt(0)+"";
					b=b.substring(1);
				}
			}else if(pre.equals("c")) {

				if(c.length()==0) {
					System.out.println("C");
					break;
				}else {
					pre=c.charAt(0)+"";
					c=c.substring(1);
				}
			}
		}

		sc.close();
	}
}