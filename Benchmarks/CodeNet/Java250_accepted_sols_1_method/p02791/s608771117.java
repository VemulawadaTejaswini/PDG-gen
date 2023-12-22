import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		
		int n = sc.nextInt();
		
		int a[]= new int[n];
		int ans=0;
        
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int min = a[0];
        
        for(int i=1; i<n; i++){
            if (min > a[i]){
                ans++;
                min = a[i];
            }
        }
		

        System.out.println(ans+1);
	}
}
