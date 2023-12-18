import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		str=sc.nextLine();
		String[] s=str.split(" ");
		for(int i=(s.length-1);i>=0;i--){
			System.out.print(s[i]+" ");
		}
		System.out.println("\n");
	}
}