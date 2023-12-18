import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
	        System.out.println( res(n));

	}
	public static StringBuilder res(long n){
		if(n<=26){
			StringBuilder sb=new StringBuilder();
			char ch = (char)((n-1)+'a');
			sb.append(ch);
			return sb;
		}
		  StringBuilder ans=new StringBuilder();
		StringBuilder a= res(n/26);
		    ans.append(a);
		    long val=n%26;
		    char ch=(char)((val-1)+'a');
		    ans.append(ch);
		    return ans;
		
	}

}