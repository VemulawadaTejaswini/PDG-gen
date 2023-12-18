import java.util.Scanner;
public class Main{
	public static void main(String[]args){
	Scanner scan=new Scanner(System.in);
	String a=scan.next();
	int b=scan.nextInt();
	for(int i=0;i<a.length();i++) {
		if(i%b==0) {
			System.out.print(a.charAt(i));
		}
	}
	System.out.println();
	}
}