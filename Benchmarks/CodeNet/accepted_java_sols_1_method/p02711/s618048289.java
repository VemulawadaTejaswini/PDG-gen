import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		for(int i=0; i<3; i++){
			if(s.charAt(i)=='7'){
				System.out.println("Yes");
				return;
			}
		}
		System.out.println("No");
	}
}
