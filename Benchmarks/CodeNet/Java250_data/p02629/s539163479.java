import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		long ts=26;
		int count=0;
		while(n-ts>0){
			count++;
			n-=ts;
			ts*=26;
		}
		StringBuilder ans=new StringBuilder();
		ts/=26;
		n--;
		for(int i=0; i<count+1; i++){
			ans.append((char)('a'+n/ts));
			n%=ts;
			ts/=26;
		}
		System.out.println(ans);
	}
}
