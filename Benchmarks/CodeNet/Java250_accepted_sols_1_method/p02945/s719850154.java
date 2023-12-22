import java.util.Scanner;

public class Main{
	public static void main(String args[]){
		Scanner pw = new Scanner(System.in);
		int a = pw.nextInt();
		int b = pw.nextInt();
		int c = a+b;
		int d = a-b;
		int e = a*b;
		int max = c;
		if(max>=d&&max>=e){System.out.print(max);}
		else if(d>=max&&d>=e){System.out.print(d);}
		else{System.out.print(e);}
		
	}
	

}
