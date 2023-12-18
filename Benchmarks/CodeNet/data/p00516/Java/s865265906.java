package text;

import java.util.Scanner;
	
	public class main {
		
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] A = new int[n];
		int[] a_monney= new int[n];
		int[] b = new int[m];
		int answer = 0;
		
		for(int i = 0;i < n;i++){
			A[i] = sc.nextInt();
			}
		
		for(int i = 0;i < m;i++){
			b[i] = sc.nextInt();
			}
		
		for(int i = 0;i < m;i++){
			int s = b[i];
			for(int j = 0;j < n;j++){
				if(s >= A[j]){
					a_monney[j]++;
					break;
					}
				}
			}
		
		int max = a_monney[0];
		
		for(int i = 0;i < n;i++){
			if(max <= a_monney[i]){
				max = a_monney[i];
				answer = i + 1;
				}
			}
		System.out.print(answer);
		}
	}