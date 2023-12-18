import java.io.*;

import java.util.*;
import java.math.*;



class Main{

	private static ArrayList<Integer> sum_check(int a){

		int count = 0;
		ArrayList<Integer> s = new ArrayList<Integer>();
		
		for(int i=0;i<=a;i++){
			s.add(0);
		}
		s.set(2,1);
		for(int i=3;i<=a;i=i+2) s.set(i,1);
		for(int i=3;i<=Math.sqrt(a);i=i+2){
			if(s.get(i) == 0) continue;
			for(int j=i+i;j<=a;j=j+i)s.set(j,0);
		}		
		return s;

	}

	

		public static void main(String args[]) throws IOException{

			Scanner scan = new Scanner(System.in);

			int n,count;
			ArrayList<Integer> a = new ArrayList<Integer>();

			ArrayList<Integer> res = new ArrayList<Integer>();


			while(scan.hasNext()){
				count = 1;

				String str1 = scan.next();

				n = Integer.valueOf(str1).intValue();

				a = sum_check(n);
				for(int i=3;i<=n;i=i+2){
					if(a.get(i) == 1)count++;
				}
				res.add(count);

			}
			for(int i=0;i<res.size();i++){
				System.out.println(res.get(i));
			}

		}

}