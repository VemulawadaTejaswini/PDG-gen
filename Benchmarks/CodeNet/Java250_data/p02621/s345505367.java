//package ABC172;
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long n=sc.nextLong();
		
		long ans=n+(long)Math.pow(n, 2)+(long)Math.pow(n, 3);
		
		System.out.println(ans);
	}

}
