

import java.util.*;
import java.io.*;
import java.math.*;

public class Main {
	public static void main(String[] args) throws Exception {
		StreamTokenizer in=new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
		while(in.nextToken()!=in.TT_EOF) {
			int T=(int) in.nval;
			in.nextToken();
			int K=(int) in.nval;
			BigInteger[] b=new BigInteger[T];
			for(int i=0;i<T;i++) {
				in.nextToken();
				b[i]=BigInteger.valueOf((long) in.nval);
			}
			int p1=0,p2=K-1;
			BigInteger sum=new BigInteger("1");
			for(int i=p1;i<=p2;i++) {
				sum=sum.multiply(b[i]);
			}
			p1++;
			p2++;
			while(p2<T) {
				BigInteger sum1=new BigInteger("1");
				for(int i=p1;i<=p2;i++) {
					sum1=sum1.multiply(b[i]);
				}
				if(sum.compareTo(sum1)<0) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
				sum=sum1;
				p1++;
				p2++;
			}
		}
	}
}
