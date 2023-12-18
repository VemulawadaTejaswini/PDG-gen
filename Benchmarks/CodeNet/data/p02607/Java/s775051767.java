import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int x = sc.nextInt();
      	int[] a =  new int[x];
		int ans = 0; 
		for(int i=0;i<x;i++){
          a[i] = sc.nextInt();
          if( i%2==0 && a[i]%2==1 )
            ans++;
		}
		System.out.println(ans);    	
	}
}