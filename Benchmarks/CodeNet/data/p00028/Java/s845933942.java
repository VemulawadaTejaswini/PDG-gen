/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        int[] a = new int[100];
        int k = 0;
        while(sc.hasNext()){
        	a[k] = sc.nextInt();
        	k++;
        }
		
		int[] num = new int[100];
		
		for(int i=0; i<a.length; i++){
			if(a[i]==0){
				break;
			}else{
				num[a[i]-1] += 1;
			}
		}
		
		/*
		for(int i=0; i<10; i++){
				System.out.println(i+1 + ":" +num[i]);
		}
		*/
		
		int target = 0;
		int j = 0;
		int[] ans = new int[100];
		for(int i=0; i<num.length; i++){
			if(i==0 || target < num[i]){
				j = 0;
				target = num[i];
				ans = new int[100];
				ans[j] = i;
			}else if(target == num[i]){
				j += 1;
				ans[j] = i;
			}
		}
		
		for(int i=0; i<ans.length; i++){
			if(i>0 && ans[i]==0){
				break;
			}else{
				System.out.println(ans[i]+1);
			}
		}
		
	}
}