import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1=sc.next();
		String s2[]=s1.split("");
		int count=0;
		for(String s:s2) {
			if(s.equals("1")) count++;
		}
		System.out.print(count);
	}
}