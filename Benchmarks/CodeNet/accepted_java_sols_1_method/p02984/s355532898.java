import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int x1 = 0;
	int mae = 0;
	int ato = 0;
	int[] a = new int[n];
	for(int i = 0; i < n; i++){
		a[i] = Integer.parseInt(sc.next());
		if(i%2 == 0){
			x1 += a[i];
		}else{
			x1 -= a[i];
		}
	}
	System.out.println(x1);
	mae = x1;
	for(int i = 0; i < n - 1; i++){
		ato = 2 * a[i] - mae;
		System.out.println(ato);
		mae = ato;
	}
}
}