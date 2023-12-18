import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		StringBuffer sb = new StringBuffer(sc.nextLine());
		StringBuffer s = sb.reverse();
		System.out.println(s);
	}
}