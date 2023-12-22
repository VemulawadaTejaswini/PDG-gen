import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		int[] num=new int[n];
		String[] buf=sc.nextLine().split(" ");
		for(int i=0; i<n; i++){
			num[i]=Integer.parseInt(buf[i]);
		}
		Arrays.sort(num);
		
		System.out.println(Math.abs(num[0]-num[num.length-1]));
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
