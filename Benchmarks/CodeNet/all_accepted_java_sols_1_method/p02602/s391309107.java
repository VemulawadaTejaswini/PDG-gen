

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
			BigInteger[] b1=new BigInteger[T-K+1];
			int p=0,count=0;
			BigInteger b3=new BigInteger("1");
			for(int i=0;i<T;i++) {
				in.nextToken();
				b[i]=BigInteger.valueOf((long) in.nval);
				b3=b3.add(b[i]);
				p++;
				if(p==K) {
					b1[count++]=b3;
				}else if(p>K){
					b3=b3.subtract(b[i-K]);
					b1[count++]=b3;
				}
			}
			for(int i=0;i<b1.length-1;i++) {
				if(b1[i].compareTo(b1[i+1])<0) {
					System.out.println("Yes");
				}else {
					System.out.println("No");
				}
			}
		}
	}
}
