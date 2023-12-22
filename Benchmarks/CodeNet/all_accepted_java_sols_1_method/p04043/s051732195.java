
import java.util.Scanner;
public class Main{ 
	public static void main(String[] args) {
	Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		int b=input.nextInt();
		int c=input.nextInt();
		if(a==5 && b==5 && c==7)
	          System.out.println("YES");
	      else if(a==7 && b==5 && c==5)
	          System.out.println("YES");
	      else if(a==5 && b==7 && c==5)
	          System.out.println("YES");
	      else
	          System.out.println("NO");}}
	