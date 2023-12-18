/* http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0500 */

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
				if(n==0){ break; }
				
				int aScore = 0;
				int bScore = 0;
				
				for(int i=0;i<n;i++){
					int a = s.nextInt();
					int b = s.nextInt();
					
					if(a>b){
						aScore += a+b;
					}else if(a<b){
						bScore += a+b;
					}else{
						aScore += a;
						bScore += b;
					}
				}
				
				System.out.println(aScore + " " + bScore);
			}

		}catch(Exception e){
			e.printStackTrace(System.out);
		}
	}
}