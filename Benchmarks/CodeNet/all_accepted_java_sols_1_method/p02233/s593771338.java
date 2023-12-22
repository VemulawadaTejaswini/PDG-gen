import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int n=in.nextInt(),A[]=new int[n+1];
		
		for(int i=0;i<=n;i++) {
			if(i==0 || i==1)A[i]=1;
			else A[i]=A[i-1]+A[i-2];
		}
		
		System.out.println(A[n]);
	}

}

