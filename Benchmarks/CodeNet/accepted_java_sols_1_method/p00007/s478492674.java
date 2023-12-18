import java.io.*;

import java.util.*;





class Main{

		
		public static void main(String args[]) throws IOException{

			ArrayList<Double> equ = new ArrayList<Double>();

			Scanner scan = new Scanner(System.in);

			int n = 0;

			

			while(scan.hasNext()){

					String str1 = scan.next();

					n = Integer.valueOf(str1).intValue();

			}

		
		int money = 100000;
		int check,surp;


		for(int i = n;i>0;i--){	

			
			check = (int)(money * 1.05);
			surp = check%1000;
			if(surp == 0)money = check;
			else{
				money = check-surp+1000;
			}
		}
		System.out.println(money);

	}
		

}