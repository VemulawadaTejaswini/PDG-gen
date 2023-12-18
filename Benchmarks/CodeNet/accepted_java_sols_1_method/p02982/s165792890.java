import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = Integer.parseInt(sc.next());
	int d = Integer.parseInt(sc.next());
	int[][] a = new int[n][d];
	int c = 0;
	int e = 0;
	int count = 0;
	for(int i = 0; i < n; i++){
		for(int j = 0; j < d; j++){
			a[i][j]= Integer.parseInt(sc.next());
		}
	}
	for(int i = 0; i < n - 1; i++){
		for(int j = i + 1; j < n; j++){
			for(int k = 0; k < d; k++){
	c += (a[i][k] - a[j][k])*(a[i][k] - a[j][k]);
			}
			e = (int)Math.sqrt(c);
			if(c == e * e)count++;
			c=0;
		}
	}
	System.out.println(count);
}
}
