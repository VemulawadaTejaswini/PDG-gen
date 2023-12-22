import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int h=sc.nextInt();
		int w=sc.nextInt();
		int n=sc.nextInt();
		int k=0;
		if(w>h){
			if(n%w>0){
				k=1;
			}
			System.out.println(n/w+k);
		}else{
			if(n%h>0){
				k=1;
			}
			System.out.println(n/h+k);
		}
	}
}
