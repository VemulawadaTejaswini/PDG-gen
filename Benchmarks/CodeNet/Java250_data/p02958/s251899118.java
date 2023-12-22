import java.util.*;
class Main{
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args){
		int n;
		n = input.nextInt();
		int A[] = new int[n+1];
		int cnt = 0;
		for(int i = 1 ;i <= n ; i++)
			A[i] = input.nextInt();
		for(int i = 1 ;i <= n ; i++){
			for(int j = i+1 ;j <= n ; j++){
				if(A[i] != i && A[j] == i){
					A[j] = A[i];
					A[i] = i;
					cnt++;
				}
			}
		}
		if(cnt <= 1)
			System.out.println("YES");
		else
			System.out.println("NO");
	}	
}