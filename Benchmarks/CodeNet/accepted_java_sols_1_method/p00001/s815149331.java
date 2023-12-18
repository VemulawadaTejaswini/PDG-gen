import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int a[]=new int[10],i=0;
		while(i<10)a[i++]=s.nextInt();
		Arrays.sort(a);
		while(i>7)System.out.println(a[--i]);
	}
}