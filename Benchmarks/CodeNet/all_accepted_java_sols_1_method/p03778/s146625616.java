import java.util.*;
public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int w = scan.nextInt();
		int a = scan.nextInt();
		int b = scan.nextInt();
		if((a-w)<=b&&b<=(a+w)){
			System.out.println("0");
		}
		else if(a<(b-w)){
			System.out.println(b-(a+w));
		}
		else if((b+w)<a){
			System.out.println(a-(b+w));
		}
	}
}