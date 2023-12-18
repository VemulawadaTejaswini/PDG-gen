import java.io.*;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		Scanner inputs = new Scanner(System.in);
		long N = inputs.nextLong();
		String ans = "";
		long temp = N;
		while(temp>0) {
			long ind = (long)Math.floor(Math.log10(temp)/Math.log10(26));
			int may = (int)(temp/Math.pow(26,ind));
			ans+=alpha.charAt((int)may-1);
			temp -= Math.pow(26, ind)*may;
		}
		System.out.println(ans);
		
	}

}
