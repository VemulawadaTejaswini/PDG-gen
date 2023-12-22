import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str="";
		StringBuffer sb;
		int counter=0;
		while(sc.hasNext()) {
			str=sc.next();
			sb=new StringBuffer(str);
			if(str.equals(sb.reverse().toString())) {
				counter++;
			}
		}
		System.out.println(counter);
		sc.close();
	}
}
