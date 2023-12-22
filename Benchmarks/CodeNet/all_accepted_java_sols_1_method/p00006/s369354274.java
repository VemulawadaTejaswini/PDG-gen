import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] c=str.toCharArray();
		for(int i=c.length-1;i>=0;i--){
			System.out.print(c[i]);
		}
		System.out.println();
	}
}