import java.io.*;
import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int n = sc.nextInt();
		int a[] = new int[w];
		int b[] = new int[w];
		int c[] = new int[w];
		int temp;
		int i = 0;
		for(i=0;i<w;i++){
			a[i] = i + 1;
			b[i] = sc.nextInt();
			c[i] = sc.nextInt();
		}
		for(i=0;i<w;i++){
			temp = a[b[i]];
			a[b[i]] = a[c[i]];
			a[c[i]] = temp;
		}
		for(i=0;i<w;i++){
			System.out.println(a[i]);
		}
	}
}