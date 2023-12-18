import java.util.*;

class Main {
	//1~100みたいにするか
	static int search(int data1[],int data2[]){
		int counter=0;
		for(int i=0; i<data2.length; i++){
			int left=0;
			int right=data1.length;
			if(data2[i]<data1[left] || data2[i]>data1[right-1]) continue;
			while(true){
				int center=(left+right)/2;
				if(data1[center]<data2[i])  left=center+1;
				else if(data1[center]>data2[i]) right=center-1;
				else if(data1[center]==data2[i]){ 
					counter++;
					break;
				}
				if(left>right) break;
			}
		}
		return counter;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int S[] = new int[n];
		for(int i=0; i<n; i++) S[i] =sc.nextInt();

		int q = sc.nextInt();
		int T[] = new int[q];
		for(int i=0; i<q; i++) T[i] =sc.nextInt();
		
		System.out.println(search(T,S));
		
	}

}