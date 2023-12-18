import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		Scanner inputs = new Scanner(System.in);
		long N = inputs.nextLong();
		long sub = N;
		long num = 26;
		int rounds =0;
		while(sub>=0) {
			sub-=num;
			num*=26;
			rounds++;
		}
		num/=26;
		sub+=num;
		String ans = "";
		sub=N;
		while(rounds-->0) {
			int ind = (int)(sub/(num/26));
			sub = sub-ind*(num/26);
			num/=26;
			ans+=alpha.charAt(ind-1);
		}
		System.out.println(ans);
		
	}

}
