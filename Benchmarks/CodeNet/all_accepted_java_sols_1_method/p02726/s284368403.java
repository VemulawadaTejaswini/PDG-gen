

import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int[] s=new int[n];
		int l1;
		int l2;
		for(int i=1;i<n;i++){
			for(int j=i+1;j<n+1;j++){
				l1=j-i;
				int ix;
				int jy;
				if(x>=i){
					ix=x-i;
				}else{
					ix=i-x;
				}
				if(y>=j){
					jy=y-j;
				}else{
					jy=j-y;
				}
				l2=ix+jy+1;
				if(l1<l2){
					s[l1]++;
				}else{
					s[l2]++;
				}
			}
		}
		for(int i=1;i<n;i++){
			System.out.println(s[i]);
		}
	}
}
