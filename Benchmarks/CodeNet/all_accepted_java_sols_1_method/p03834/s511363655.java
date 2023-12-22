import java.util.Scanner;
public class Main{
	public static void main(String[]args) {
		Scanner input=new Scanner(System.in);
		String s=input.next();
		String result=s.replaceAll("[,]"," ");
		System.out.println(result);
	}
}