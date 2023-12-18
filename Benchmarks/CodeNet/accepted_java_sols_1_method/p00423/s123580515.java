import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			int aa=0, bb=0;
			for(int i=0; i<n; i++){
				int a = in.nextInt(), b = in.nextInt();
				if(a > b){
					aa += a+b;
				}
				else if(a==b){
					aa += a;
					bb += b;
				}
				else{
					bb += a+b;
				}
			}
			System.out.println(aa + " " + bb);
		}
		
	}
}