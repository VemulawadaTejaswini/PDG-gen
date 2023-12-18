import java.util.Scanner;
public class Main {
	public static void main(String[] a){
		Scanner s=new Scanner(System.in);
		String str=s.next();
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());
	}
}