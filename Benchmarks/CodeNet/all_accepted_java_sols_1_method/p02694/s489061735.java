import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long x=sc.nextLong();
		long tmp=100;
		int count=0;
		while(x>tmp){
			tmp=tmp+(long)(double)tmp/100;
			count++;
		}
		System.out.println(count);
	}
}