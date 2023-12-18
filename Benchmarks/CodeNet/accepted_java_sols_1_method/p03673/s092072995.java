import java.util.*;
import java.io.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i=0; i<n; i++){
			arr[i] = sc.nextInt();
		}
		
		int i=0;
		for(i=n-1; i>=0; i-=2){
			System.out.print(arr[i] + " ");
		}
		if(n != 1){
			if(n%2 == 0) i=0;
			else i = 1;
		
			for(; i<n; i+=2){
				System.out.print(arr[i] + " ");
			}
		}
		
		
		/*ArrayList<String> arrayList = new ArrayList<String>();
		arrayList.add(arr[0] + "");
		for(int i=1; i<n; i++){
			arrayList.add(arr[i] + "");
			Collections.reverse(arrayList);
		}
		
		for(int i=0; i<arrayList.size(); i++){
			System.out.print(arrayList.get(i) + " ");
		}
		System.out.println("");*/
	}
}