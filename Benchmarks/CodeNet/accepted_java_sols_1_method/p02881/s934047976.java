//package ac144;
import java.lang.*;
import java.math.*;
import java.util.ArrayList;
import java.util.*;
import java.io.*;
public class Main {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long n =scn.nextLong();
//		ArrayList<Long> al = new ArrayList<>();
		int s = (int) Math.sqrt(n);
		boolean flag = true;
		long n1 = -1;
		long n2 = -1;
		while(flag) {
			if(n%s==0) {
				flag = false;
				n1 = s;
				n2 = n/s;
			}else {
				s--;
			}

		}
		
		long ans = n1+n2-2;
		System.out.println(ans);
	}

}
