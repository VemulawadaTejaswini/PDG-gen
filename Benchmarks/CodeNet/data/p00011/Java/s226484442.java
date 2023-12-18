import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[w];
		int b[] = new int[n];
		int c[] = new int[n];
		int temp = 0;
		int i = 0;
		String str;
		for(i=0;i<n;i++){
			str = sc.next();
			String[] bc = str.split(",");
			b[i] = Integer.parseInt(bc[0])-1;
			c[i] = Integer.parseInt(bc[1])-1;
		}
		for(i=0;i<w;i++){
			a[i] = i + 1;
		}
		for(i=0;i<n;i++){
			temp = a[b[i]];
			a[b[i]] = a[c[i]];
			a[c[i]] = temp;
		}
		for(i=0;i<w;i++){
			System.out.println(a[i]);
		}
	}
}