import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int q=n+1;
		for(int i=0; i<n; i++){
			int p=sc.nextInt();
			if(q>p){
				count++;
				q=p;
			}
		}
		System.out.println(count);
	}
}
