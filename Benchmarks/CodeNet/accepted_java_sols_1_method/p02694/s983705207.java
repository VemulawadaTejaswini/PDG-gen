
import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		long x=sc.nextLong();
		long sum=100;
		int y=0;
		
		while(sum<x){
			sum*=1.01;
			y++;
		}
		System.out.println(y);
		

		
	}
	
}
