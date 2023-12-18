import java.util.*;
import java.math.BigDecimal;

public class Main{
	static public void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		double num1=sc.nextDouble();
		String str=String.valueOf(num1*num);
		
		for(int i=0;i<str.length();i++){
			if((str.charAt(i))=='.')break;
			else System.out.print(str.charAt(i));
		}
		
		sc.close();
	}
}