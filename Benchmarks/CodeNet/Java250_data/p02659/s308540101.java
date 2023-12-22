
import java.util.*;
 interface aisatu{
	final String str="こんにちは";
	void mesod();
}

public class Main {
	static public void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		long a=sc.nextLong();
		
		String str=sc.next();
		int b=(int)(Double.parseDouble(str)*100+0.01);
		System.out.print((a*b)/100);
	}

}

