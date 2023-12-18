
import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		char[] chr=str.toCharArray();
		for(int j=0;j<str.length();j++){
			System.out.print(chr[str.length()-j-1]);
		}
		sc.close();
	}
}