import java.util.Scanner;
import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;


public class Main {

	public static void main(String args[]){
		int n=100;
		int i,j,k,v,l;
		int a[]=new int[n+1];
		 Scanner sc = new Scanner(System.in);
		k=Integer.parseInt(sc.next());
		
		for(i=0;i<k;i++){
			a[i]=Integer.parseInt(sc.next());
		}
		for(i=0;i<k;i++){
			System.out.print(a[i]);
		}
		
		System.out.println();
		for(i=1;i<k;i++){
			v=a[i];
			j=i-1;
			while(j>=0&&a[j]>v){
				a[j+1]=a[j];
			
				j--;
			}
				a[j+1]=v;
			for(l=0;l<k;l++){
				System.out.print(a[l] );
			}
			System.out.println();
			
		}
		
	}
}