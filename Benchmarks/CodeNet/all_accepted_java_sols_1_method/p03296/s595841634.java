import java.util.*;

class Main{
	
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		for(int n=0;n<N;n++){
			arr[n] = sc.nextInt();
		}

		int p=-1;

		int cnt = 0;
		for(int n=0;n<N;n++){
			if(p == arr[n]){
				cnt++;
				p = -1;
			}
			else{
				p = arr[n];
			}
		}
		System.out.println(cnt);
	}
}