import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a;
		for(int i = 1;(a=sc.next())!="0";i++){
			System.out.println("Case "+i+": "+a);
		}
	}
}