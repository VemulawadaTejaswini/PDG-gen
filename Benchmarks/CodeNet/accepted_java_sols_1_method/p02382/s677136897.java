
import java.util.*;

public class Main {
	 
	static String str;
	
	public static void main(String[] args) {
		Scanner cin=new Scanner(System.in);
		
		int n=cin.nextInt();double D=0;
		List<Integer> xa=new ArrayList<>(),ya=new ArrayList<>();
		
		for(int i=0;i<n;i++) xa.add(cin.nextInt());
		for(int i=0;i<n;i++) ya.add(cin.nextInt());
		
		for(int i=0;i<n;i++) D+=Math.abs(xa.get(i)-ya.get(i));
		System.out.println(D);
		D=0;
		
		for(int i=0;i<n;i++) D+=Math.pow(xa.get(i)-ya.get(i),2);
		System.out.println(Math.sqrt(D));
		D=0;
		
		for(int i=0;i<n;i++) D+=Math.pow(Math.abs(xa.get(i)-ya.get(i)),3);
		System.out.println(Math.cbrt(D));
		D=0;
		
		for(int i=0;i<n;i++) D=Math.max(Math.abs(xa.get(i)-ya.get(i)), D);
		System.out.println(D);
	}
	
	
	
}
