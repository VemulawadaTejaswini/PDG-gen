import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i = 0 ; i < n ; i++){
			
			a[i] = scan.nextInt() - 1;
			
		}
		
		int cnt = 0;
		
		for(int i = 0 ; i < n ; i++){
			
			if(a[i] == -1){
				
			} else if(a[a[i]] == i){
				
				cnt++;
				a[a[i]] = -1;
				
			}
			
		}
		
		System.out.println(cnt);
		
	}
}
