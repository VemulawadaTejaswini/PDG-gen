import java.util.*;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		
		char ch1=str.charAt(0),ch2=str.charAt(1),ch3=str.charAt(2);
		if(ch1==ch2&&ch1=='R')System.out.println(2);
		else if(ch2==ch3&&ch2=='R')System.out.println(2);
		else if(ch1==ch2&&ch2==ch3&&ch1=='R')System.out.println(3);
		else if(ch1!=ch2&&ch2!=ch3)System.out.println(1);
		else System.out.println(0);
		sc.close();
		return;
	}
}