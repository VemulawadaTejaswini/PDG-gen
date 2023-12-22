import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int t = sc.nextInt();
		
		int[] cc = new int[n];
		int[] tt = new int[n]; 
		
		for(int i=0;i<n;i++){
			cc[i] = sc.nextInt();
			tt[i] = sc.nextInt();
		}
		
		int min = Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
			if(tt[i]<=t && cc[i]<min)
				min=cc[i];
		}
		
		System.out.println(min==Integer.MAX_VALUE ? "TLE" : min);
	}
}
/*
3 70
7 60
1 80
4 50
*/