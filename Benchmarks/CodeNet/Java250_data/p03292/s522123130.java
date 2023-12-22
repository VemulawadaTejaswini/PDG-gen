import java.lang.*;
import java.io.*;
import java.util.*;

class Main{
	public static void main(String args[]) throws FileNotFoundException{
		Scanner sc=new Scanner(System.in);
		
		String[] buf=sc.nextLine().split(" ");
		int[] n=new int[3];
		n[0]=Integer.parseInt(buf[0]);
		n[1]=Integer.parseInt(buf[1]);
		n[2]=Integer.parseInt(buf[2]);
		Arrays.sort(n);
		System.out.println((n[2]-n[1])+(n[1]-n[0]));
		
			
	}

	static void disp(int[] data){
		for(int i=0; i<data.length; i++){
				System.out.printf("%d ",data[i]);
		}
			System.out.println();
	}
}
