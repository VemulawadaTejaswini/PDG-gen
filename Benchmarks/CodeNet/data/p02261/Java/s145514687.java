

import java.awt.print.Printable;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		String[] str1=new String[n];
		for(int i=0;i<n;i++){
			str1[i]=scanner.next();
		}
		String[] str2=Arrays.copyOf(str1, str1.length);
		
		bubbleSort(str1,n);
		selectionSort(str2,n);
		
		
		print(str1,n);
		System.out.println("Stable");
		print(str2,n);
		if(isStable(str1, str2, n)){
			System.out.println("Stable");
		}
		else{
			System.out.println("Not stable");
		}
	}



	private static boolean isStable(String[] str1, String[] str2, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			if(str1[i].charAt(0)!=str2[i].charAt(0))
				return false;
		}
		
		return true;
	}



	private static void selectionSort(String[] str, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(str[j].charAt(1)<str[min].charAt(1)){
					min=j;
				}
			}
			
			String tmp=str[i];
			str[i]=str[min];
			str[min]=tmp;
			
		}
	}

	private static void bubbleSort(String[] str, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<n;i++){
			for(int j=n-1;j>i;j--){
				if(str[j].charAt(1)<str[j-1].charAt(1)){
					String tmp=str[j];
					str[j]=str[j-1];
					str[j-1]=tmp;
				}
			}
		}
	}

	private static void print(String[] str, int n) {
		// TODO Auto-generated method stub
		int i=0;
		for(i=0;i<n-1;i++){
			System.out.print(str[i]+" ");
		}
		System.out.println(str[i]);
	}

	
}

