import java.util.*;
import java.io.*;

class Main{
	public static void main(String[] args){
		int i;
		int j;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] C1 = new String[n];
		String[] C2 = new String[n];
		String c;

		for(i=0 ; i<n ; i++){
			c = scan.next();
			C1[i] = c;
			C2[i] = c;
		}

		BubbleSort(C1, n);
		SelectionSort(C2, n);

		StringBuffer sb = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for(i=0 ; i<C1.length-1 ; i++){
			sb.append(C1[i]+" ");
			sb2.append(C2[i]+" ");
		}
		sb.append(C1[i]);
		System.out.println(sb);
		System.out.println("Stable");
		sb2.append(C2[i]);
		System.out.println(sb2);
		if((CheckC(C1, C2)) == true)System.out.println("Stable");
		else System.out.println("Not stable");

	}

 static void BubbleSort(String[] C, int n){
	 int i;
	 int j;
	 String v;

		for(i=0 ; i<n ; i++){
			for(j=n-1 ; j>i ; j--){
				if(C[j].charAt(1) < C[j-1].charAt(1)){
					v = C[j];
					C[j] = C[j-1];
					C[j-1] = v;
				}
			}
		}
}

static void SelectionSort(String[] C, int n){
	int i;
	int j;
	String v;
	int minj;

		for(i =0; i<n; i++){
			minj = i;
			for(j = i; j<n;j++){
				if(C[minj].charAt(1)>C[j].charAt(1))minj =j;
			}
			v = C[minj];
			C[minj] = C[i];
			C[i] = v;
		}
}



static boolean CheckC(String[] C1, String[] C2){
	for(int i=0 ; i<C1.length ; i++){
		if(C2[i] != C1[i])return false;
	}
	return true;
}


}

