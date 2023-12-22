import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		if(R<1200)System.out.println("ABC");
		if((1200<=R) && (R<2800))System.out.println("ARC");
		if(2800<=R)System.out.println("AGC");
	}
}