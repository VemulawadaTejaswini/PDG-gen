
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int countr = 0;
		int countg = 0;
		int countb = 0;
		long sum = 0;
		for(int i=0;i<n;i++){
			if((int)s.charAt(i)==(int)'R'){
				countr++;
			}
			if((int)s.charAt(i)==(int)'G'){
				countg++;
			}
			if((int)s.charAt(i)==(int)'B'){
				countb++;
			}
		}
		sum = (long)countr * (long)countg * (long)countb;
		long countx = 0;
		for(int i=0;i<n;i++){
			for(int j=1;j<n;j++){
				if(i+2*j>=n){
					break;
				}
				int left = (int)s.charAt(i);
				int center = (int)s.charAt(i+j);
				int right = (int)s.charAt(i+2*j);
				if(left!=center && center!=right && left!=right){
					countx++;
				}
			}
		}
		System.out.println(sum - countx);
	}
}