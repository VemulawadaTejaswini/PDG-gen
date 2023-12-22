import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		int arr[] = new int[N];

		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
		}

		int cnt = 0;
		for(int n=0;n<N;n++){
			while(arr[n]%2 == 0){
				cnt++;
				arr[n] /= 2;
			}
		}

		System.out.println(cnt);


	}
}