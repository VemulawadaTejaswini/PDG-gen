import java.util.Scanner;
public class Main{
	public static void main (String[] args){
		int x,i;
		Scanner scan = new Scanner(System.in);
		for(i=1;i<=100000;i++){
	    x = Integer.parseInt(scan.next());
	    System.out.println("case" +i+":"+x);
		}
	}
}