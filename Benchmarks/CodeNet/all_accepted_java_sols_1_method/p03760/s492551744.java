import java.util.Scanner;

public class Main{
	
	static Scanner s=new Scanner(System.in);
	
	public static void main(String[] __){
		StringBuilder sb=new StringBuilder();
		String[] in= {s.next(),s.next()};
		int l=in[0].length()+in[1].length();
		
		for(int i=0;i<l;i++)
			sb.append(in[i%2].charAt(i/2));
		System.out.println(sb.toString());
	}
}
