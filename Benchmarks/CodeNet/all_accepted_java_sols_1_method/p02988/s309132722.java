import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int[] a = new int[n];
	int count = 0, p = 0, q = 0;
	for(int i = 0; i < n; i++){
		a[i] = Integer.parseInt(sc.next());
	}
	for(int i = 0; i < n-2; i++){
		if(a[i] > a[i+1])p++;
		if(a[i+2] > a[i+1])q++;
		if((p+q) == 1)count++;
		p=0;
		q=0;
	}
	System.out.println(count);
}
}