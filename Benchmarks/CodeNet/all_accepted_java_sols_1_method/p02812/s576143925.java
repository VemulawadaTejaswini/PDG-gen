import java.util.*;
import java.math.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int ans=0;
		for(int i=0; i<n-2; i++){
			if(s.substring(i,i+3).equals("ABC")){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
