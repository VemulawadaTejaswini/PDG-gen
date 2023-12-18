import java.io.*;
import java.util.*;

class Main{
		private static int my_pow(int a){
		return a*a;
		}
		private static int l_square(int size){
			int sum = 0,count=1;
			for(int i=size;i<=600-size;i=i+size){
				sum = sum+my_pow(count*size)*size;
				count++;
			}
			return sum;
		}
		
		public static void main(String args[]) throws IOException{
			ArrayList<Integer> inp = new ArrayList<Integer>();
			ArrayList<Integer> sq_size = new ArrayList<Integer>();
			ArrayList<Integer> res = new ArrayList<Integer>();
			
			Scanner scan = new Scanner(System.in);
			while(scan.hasNext()){
				String str1 = scan.next();
				inp.add(Integer.valueOf(str1).intValue());
			}

			for(int i=0;i<inp.size();i++){
				res.add(l_square(inp.get(i)));
			}
			for(int i=0;i<res.size();i++){
				System.out.println(res.get(i));
			}
	}
}