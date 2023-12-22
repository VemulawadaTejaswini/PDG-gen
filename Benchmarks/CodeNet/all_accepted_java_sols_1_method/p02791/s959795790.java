import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		/*boolean [] flag = new boolean[n];
		for(int i = 0; i < n; i++) {
			flag[i] = true;
		}
		*/
	/*	//ここがTLEの部分
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(p[i] > p[j]) {
					flag[i] = false;
				}
			}
		}*/
		int cnt = 1;
		/*
		for(int i = 1; i < n; i++) {
			Arrays.sort(p,0,i);
			if(p[i]<=p[0]) {
				cnt++;
			}
		}*/
		
		/*for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				if(p[i] > p[j]) {
					break;
				}
				if(j== i-1) {
					cnt++;
				}
			}
		}*/
		
		/*for(int i = 0; i < n; i++) {
			if(flag[i]) {
				cnt++;
			}
		}*/
		/*
		for(int i = 0; i < n; i++) {
			int left = 0;
			int right = i;
			while(left < right) {
				int mid = (left+right)/2;
				if(p[i] > p[j]) {
					break;
				}else {
					
				}
			
				
			
			}
		}
		
		*/
		int min = p[0] ;
		
		for(int i = 0; i < n-1; i++) {
			if(min >= p[i+1]) {
				cnt++;
				min = p[i+1];
			}
		}
		
		
		System.out.println(cnt);
	}

}
