import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String s=sc.next();
		if(a%2==1){
			System.out.println("No");
			return;
		}
		if(s.substring(0,a/2).equals(s.substring(a/2,a))){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
