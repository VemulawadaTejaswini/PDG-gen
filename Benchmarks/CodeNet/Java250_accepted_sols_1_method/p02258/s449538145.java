

import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int R[]=new int[n];
		for(int i=0;i<n;i++){
			R[i]=s.nextInt();
		}
		//ri ?????????
		int ri=R[0];
		//rj ???????????????
		int max=R[1]-ri;
		for(int i=2;i<R.length;i++){
			if(ri>R[i-1])ri=R[i-1];
			if(max<R[i]-ri)max=R[i]-ri;
		}
		System.out.println(max);
	}
}