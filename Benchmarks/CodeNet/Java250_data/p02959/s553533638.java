import java.util.Scanner;

public class Main {
	public static void solution(int [] arr1, int [] arr2) {
		long monster = 0;
		for(int i=0;i<arr2.length;i++) {
			if(arr1[i]>=arr2[i]) {
				monster+=arr2[i];
			}
			else {
				if(arr1[i]+arr1[i+1]>=arr2[i]) {
					monster+=arr2[i];
					arr1[i+1]-=arr2[i]-arr1[i];
				}
				else {
					monster+=arr1[i]+arr1[i+1];
					arr1[i+1]=0;
				}
			}
		}
		System.out.println(monster);
	}
	
	
	public static void main(String args []) {
		Scanner obj = new Scanner(System.in);
		int n = obj.nextInt();
		int a [] = new int [n+1];
		int b [] = new int [n];
		for(int i=0;i<a.length;i++) {
			a[i]= obj.nextInt();
		}
		for(int i=0;i<b.length;i++) {
			b[i]= obj.nextInt();
		}
		solution(a,b);
		
	}
}
