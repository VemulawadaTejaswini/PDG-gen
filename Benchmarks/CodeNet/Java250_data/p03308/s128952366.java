import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int min=-1,max=-1;
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
			if(min==-1){
				min = arr[n];
				max = arr[n];
			}
			if(min > arr[n]) min = arr[n];
			if(max < arr[n]) max = arr[n];
		}

		System.out.println(max-min);

	}
}