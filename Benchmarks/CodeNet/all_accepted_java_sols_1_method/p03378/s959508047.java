

import java.io.*;
import java.util.*;
class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[]=br.readLine().split(" ");
		int  n =Integer.parseInt(s[0]);
		int  m =Integer.parseInt(s[1]);
		int  x =Integer.parseInt(s[2]);
		int arr[] = new int[m];
		String s1[] = br.readLine().split(" ");
		for (int i = 0; i < s1.length; i++) {
			arr[i]=Integer.parseInt(s1[i]);
		}
		/*int res=0;
		int left = 0;
		int right = m-1;
		if(x > arr[m-1] || x< arr[0]) {
			System.out.println(0);
			
		}
		else {
		while(left<right) {
			int mid = (left+right)/2;
			//System.out.println("mid"+mid);
			if(arr[mid] < x) {
				res = mid;
				left = mid+1;
			}
			else {
				right = mid-1;
			}
		}
		if(arr[m-1] == n) {
			System.out.println(Math.min(res+1, m-res-2));
		}
		else
		System.out.println(Math.min(res+1, m-res-1));
		}*/
		int res=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<x) {
				res++;
			}
			else {
				break;
			}
		}
		System.out.println(Math.min(res, m-res));
	}

}
