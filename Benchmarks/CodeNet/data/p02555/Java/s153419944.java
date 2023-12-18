import java.util.*;
public class Main {
    public static long mod(long x, long y){
    return x%y<0?x%y+(y<0?-y:y):x%y;
    }
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		long [] in = new long [a+1]; 
        in[0]=1;
		long b = 1000000007;
      
        for(int i=3;i<=a;i++){
          for(int j=0;j<=i-3;j++){in[i]+=in[j];
                                                     in[i]=mod(in[i],b);
                                 }
                             }        
		System.out.println(in[a]);
	}
}