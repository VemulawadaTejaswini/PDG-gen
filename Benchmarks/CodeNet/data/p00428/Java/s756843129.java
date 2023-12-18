/*  http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0505 */

import java.util.*;
import java.lang.*;
import java.io.*;

class Main
{
	public static void main (String[] args){
		try{
			Scanner s = new Scanner(System.in);
			
			
			while(true){
				int n = s.nextInt();
				int m = s.nextInt();
		
				if(n==0 && m==0) { break; }
				
				final int[] count = new int[m];
				
				for(int i=0;i<n;i++){
					for(int j=0;j<m;j++){
						int x = s.nextInt();
						if(x==1){
							count[j]++;
						}
					}
				}
				
				Integer[] indexes = new Integer[m];
				for(int i=0;i<m;i++){
					indexes[i] = i+1;
				}
				
				Arrays.sort(indexes, new Comparator<Integer>(){
					@Override
					public int compare(Integer i1, Integer i2){
						return count[i2-1] - count[i1-1];
					}
				});
				
				System.out.println(Arrays.toString(indexes).replaceAll("[,\\[\\]]",""));
			}

		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
}