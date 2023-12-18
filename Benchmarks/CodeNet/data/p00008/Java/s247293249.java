import java.io.*;

import java.util.*;



class Main{

	private static int sum_check(int a){

		int count = 0;

		for(int i = 0;i<=9;i++){
			for(int j = 0;j<=9;j++){
				for(int k = 0;k<=9;k++){
					for(int l = 0;l<=9;l++){
						if((i+j+k+l) == a){count++;}
					}	
				}
			}

		}			

		return count;

	}

	

		public static void main(String args[]) throws IOException{

			Scanner scan = new Scanner(System.in);

			int n,count;

			

			while(scan.hasNext()){

				String str1 = scan.next();

				n = Integer.valueOf(str1).intValue();

				count = sum_check(n);

				System.out.println(count);

			}

		}

}