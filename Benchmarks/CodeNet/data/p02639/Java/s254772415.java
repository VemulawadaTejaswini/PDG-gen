import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;
import java.util.List;
import java.lang.Math;
import java.util.HashMap;
public class Main {
	public static int useBs(int[] arr, int targetValue) {	
		int a =  Arrays.binarySearch(arr, targetValue);
		if(a >=0 && a<arr.length)
			return a;
		else
			return -1;
	}
	public static void printArray(int []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	public static void printArrayLong(long []a) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
	static boolean isPalindrome(String s) {
		int l=s.length();
		for(int i=0;i<l/2;i++)
		{
			if(s.charAt(i)!=s.charAt(l-i-1))
				return false;
		}
		return true;
	}
	static String revString(String str)
	{
		return new StringBuffer(str).reverse().toString();
	}
	static String sortString(String s) {
		char a[]=s.toCharArray();
		Arrays.sort(a);
		return new String(a);
	}
	static int sumList(List<Integer>a) {
		return a.stream().mapToInt(Integer::intValue).sum();
	}
	static int sumArray(int []a) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
    public static void main(String[]args) throws java.lang.Exception{
    	Scanner sc=new Scanner(System.in);
    	int t=1;
    	while(t-->0) {
    		int a[]=new int[5],ans=0;
    		for(int i=0;i<5;i++) {
    			a[i]=sc.nextInt();
    			if(a[i]==0)ans=i+1;
    		}
    		System.out.println(ans);
    	}
    	
    	
    }
}
