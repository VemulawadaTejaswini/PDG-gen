import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		int n = sc.nextInt();
        int x = sc.nextInt();
      	//配列
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
        	a[i] = sc.nextInt();
        }
		Arrays.sort(a);
        int count = 0;
      
        long sum = 0;
        for (int i=0; i<n; ++i){
          sum = sum + a[i];
        }
      	if(sum == x){
          System.out.println(n);
        }else if(sum < x){
          System.out.println(n-1);
        }else{
        for(int i = 0; i < n; i++){
          if(x >= a[i]){
             x = x - a[i];
            count++;
          }
        }
        System.out.println(count);
      }
        }
}
