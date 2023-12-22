import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		if((c+b-1)/b>(a+d-1)/d){
			System.out.println("No");
		}else{
			System.out.println("Yes");
		}
	}
}
