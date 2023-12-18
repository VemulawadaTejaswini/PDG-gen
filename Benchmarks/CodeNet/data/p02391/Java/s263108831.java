import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		int x,y;
		Scanner scan = new Scanner(System.in);
	     x = Integer.parseInt(scan.next());
	     y = Integer.parseInt(scan.next());
		if(x<y){
		System.out.println("a<b");
		}else if(x>y){
		System.out.println("a>b");
		}else{
	    System.out.println("a==b");
		}
		
	}
}