import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                   int a = scan.nextInt();
		int b = scan.nextInt();
		if(a >= -1000 && b <= 1000){
		    if(a<b){
			 System.out.println("a < b");
		     }
	              if(a>b){
			  System.out.println("a > b");
		     }
                         if(a==b){
			  System.out.println("a = b");
			}
		}
	}
}