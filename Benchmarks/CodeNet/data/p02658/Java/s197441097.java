import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long ans = 1;
		long[] a = new long[n];
		for(int i = 0; i < a.length; ++i){
          a[i] = sc.nextLong();
        } 
        for(int i=0; i<n; ++i){
            ans = ans*a[i];
        }
        int[] b = new int[18];
        for(int j=0; j<18; ++j){
            b[j] = 10;
        }
        long num = 1;
        for(int j=0; j<18; ++j){
            num = num*b[j];
        }
        if(ans > num){
            System.out.println("-1");
        }else{
             System.out.println(ans);
        }
	}
}
