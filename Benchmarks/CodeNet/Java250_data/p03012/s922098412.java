import java.util.*;
import java.lang.*;
import java.io.*;

public class Main{
public static void main (String[] args){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int[] w = new int[n];
	int[] wdif = new int[n-1];
	int s1 = 0;
	int s2 = 0;
	for(int i = 0; i < w.length; i++){
		w[i] = sc.nextInt();	
	}
	for(int t = 0; t < wdif.length; t++){
		for(int i = 0; i < w.length; i++){
			if(i<=t){
				s1 += w[i];
			}else{
				s2 += w[i];
			}
		}
		wdif[t] = Math.abs(s1 - s2);
		s1 = 0;
		s2 = 0;
	}
	System.out.println(minAr(wdif));
}

static int minAr(int[] a){
	int min=0;
	for(int i = 0; i < a.length; i++){
		if(i==0){
			min = a[i];
		}else{
			min = Math.min(min,a[i]);
		}
	}
	return min;
}
}
