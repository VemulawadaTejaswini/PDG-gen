import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;
class Main{
	public static void main(String[] args) {
		InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        Scanner in = new Scanner(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
      	int n=in.nextInt(), k=in.nextInt(),sum=0;
      	int a[]=new int[n];
      	for(int i=0;i<n;i++)
      		a[i]=in.nextInt();
      	Arrays.sort(a);
      	for(int i=0;i<k;i++){
      		sum+=a[i];
      	}
      	System.out.println(sum);
	} 
}
