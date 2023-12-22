import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		String t=s.next();
		int a=Integer.parseInt(t.substring(0,2));
		int b=Integer.parseInt(t.substring(2));
		if(0<a&&a<13) {
			if(0<b&&b<13) {
				System.out.println("AMBIGUOUS");
			}else {
				System.out.println("MMYY");
			}
		}else {
			if(0<b&&b<13) {
				System.out.println("YYMM");
			}else {
				System.out.println("NA");
			}
		}
	}
}