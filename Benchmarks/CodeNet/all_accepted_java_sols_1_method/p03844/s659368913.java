import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		String str=sc.next();
		int b=sc.nextInt();
		if(str.equals("+"))System.out.print(a+b);
		else System.out.print(a-b);
		sc.close();
		return;
	}
}