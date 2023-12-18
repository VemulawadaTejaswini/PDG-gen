import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int x=in.nextInt();
		System.out.println(fillZero(Integer.toBinaryString(x)));
		System.out.println(fillZero(Integer.toBinaryString(~x)));
		System.out.println(fillZero(Integer.toBinaryString(x<<1)));
		System.out.println(fillZero(Integer.toBinaryString(x>>1)));
	}
	
	static String fillZero(String str) {
		String zero="";
		for(int i=0;i<32-str.length();i++)zero+="0";
		return zero+str;
	}

}

