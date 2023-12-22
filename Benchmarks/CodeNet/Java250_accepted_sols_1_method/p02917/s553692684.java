import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int ans = 0;
		
		for(int i=0; i<n-1; i++){
		    b[i] = sc.nextInt();
		}
		
		for(int i=0; i<n-1; i++){
		    if(i==0){
		        a[i]=b[i];
		    }else{
		        if(b[i]>=b[i-1]){
		            a[i]=b[i-1];
		        }else{
		            a[i]=b[i];
		        }
		    }
		    ans+=a[i];
		}
		
		ans+=b[n-2];
        System.out.println(ans);
	}
}
