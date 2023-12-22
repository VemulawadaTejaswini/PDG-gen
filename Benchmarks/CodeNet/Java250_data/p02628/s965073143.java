/*package whatever //do not write package name here */
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
	public static void main (String[] args) {
// 		System.out.println("GfG!");
        Scanner input=new Scanner(System.in);
       int n=input.nextInt();
       int k=input.nextInt();
       int[] p=new int[n];
       for(int i=0;i<n;i++)
            p[i]=input.nextInt();
        Arrays.sort(p);
        int ans=0;
        for(int i=0;i<k;i++)
            ans+=p[i];
        System.out.println(ans);
       input.close();
	}
}