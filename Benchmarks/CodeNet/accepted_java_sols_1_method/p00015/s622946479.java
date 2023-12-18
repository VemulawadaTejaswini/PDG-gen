import java.math.*;
import java.io.*;
import java.util.*;

public class Main{
	
	public static void main(String []args)
	{
		Scanner cin=new Scanner(System.in);
		int n = cin.nextInt();
		while(n--!=0){
			BigInteger b=cin.nextBigInteger(),a=cin.nextBigInteger();
			if(a.add(b).toString().length()>80){
				System.out.println("overflow");
			}else System.out.println(a.add(b).toString());
			
		}
	}
}