import java.util.*;
import java.math.*;

class Main{
	public static void main(String args[]){
		Scanner s=new Scanner(System.in);
		int a,b,c;
		while(s.hasNext()){
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			BigDecimal bd=new BigDecimal(a);
			bd=bd.setScale(c+5);
			bd=bd.divide(new BigDecimal(b),RoundingMode.HALF_DOWN).remainder(new BigDecimal(1));
			int sum=0;
			String str=bd.toPlainString();
			//System.out.println(str);
			for(int i=0;i<c;i++)sum+=str.charAt(2+i)-'0';
			System.out.println(sum);
		}
	}
}