import java.io.*;

import java.util.*;



class Main{

	private static ArrayList<Integer> calc_gcd_lcm(ArrayList<Integer> a){

		ArrayList<Integer> b = new ArrayList<Integer>();

				

		for(int i = 0;i<a.size()/2;i++){

			

			int x,y,x1,y1,j,k;
			x1 = 0;
			y1 = 0;

			if(a.get(i*2) > a.get(i*2+1)){
				x = a.get(i*2);
				y = a.get(i*2+1);
				x1 = x;
				y1 = y;
			}
			else{
				x = a.get(i*2+1);
				y = a.get(i*2);
				x1 = x;
				y1 = y;
			}

			j = x1%y1;
			
			while(j != 0){
				x1 = y1;
				y1 = j;
				j = x1%y1;
			}
			b.add(y1);
			k = x/y1*y;
			b.add(k);

			

			}

		return b;

	}

	private static void print_calc(ArrayList<Integer> a){

		String str1,str2;

		int x,y;

		

		for(int i = 0;i<a.size()/2;i++){	

			

			x = a.get(i*2);

			y = a.get(i*2+1);

			

			System.out.println( x + " " + y );

			

		}

	}

		public static void main(String args[]) throws IOException{

			ArrayList<Integer> val = new ArrayList<Integer>();

			Scanner scan = new Scanner(System.in);

			int n;

			

			while(scan.hasNext()){

					String str1 = scan.next();
					n = Integer.valueOf(str1).intValue(); 

					val.add(n);

			}

						

			

			ArrayList<Integer> res = new ArrayList<Integer>();

			res = calc_gcd_lcm(val);

			print_calc(res);

	}

}