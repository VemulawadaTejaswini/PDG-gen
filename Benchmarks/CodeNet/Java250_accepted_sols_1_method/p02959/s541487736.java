import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); 
        long [] a = new long [n+1];
        long [] b = new long [n];
        long ans = 0;
		for(int i=0;i<n+1;i++){a[i] = sc.nextLong();
                              } 
        for(int i=0;i<n;i++){b[i] = sc.nextLong();
                            }
        for(int i=0;i<n;i++){long c = Math.min(a[i],b[i]);ans+=c;a[i]-=c;b[i]-=c;
                            long d = Math.min(a[i+1],b[i]);ans+=d;a[i+1]-=d;b[i]-=d;
                            }
		System.out.println(ans);
	}
}
