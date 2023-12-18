import java.io.*;
import java.util.*;

class Main{
	private static int[] sum_dig(int[][] a){
		int b[] = new int[100];
		
		for(int i = 0;i<a.length;i++){
			int sum =  a[i][0]+a[i][1];
			String sums;
			sums = String.valueOf(sum);
			b[i] = sums.length();
			if(sum == 0) b[i] = 1;
			}
		return b;
	}
	private static void print_dig(int[] a){
		for(int i = 0;i<a.length;i++){
			if((a[i] == 0) && (a[i+1] == 0)) break;
			System.out.println(a[i]);
		}
	}
		public static void main(String args[]) throws IOException{
			int dig[][] = new int[100][2];
			InputStreamReader inp = new InputStreamReader(System.in);
			BufferedReader bre = new BufferedReader(inp);
			int n1,n2,i = 0;
			while(bre.ready()!=true){
				try{
				String num = bre.readLine();
				
				String[] numAry = num.split(" ");
				n1 = Integer.parseInt(numAry[0]);
				n2 = Integer.parseInt(numAry[1]);
				dig[i][0] = n1;
				dig[i][1] = n2;
				i++;
			}
			catch(NumberFormatException e){
				break;
			}
		}
			int res[] = new int[3];
			res = sum_dig(dig);
			print_dig(res);
	}
}