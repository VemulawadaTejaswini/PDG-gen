import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] in = new int [100000];
        long ans = 0;
        for(int i=0;i<n;i++){int a = sc.nextInt();
                             in[a-1]++;
                             ans+=a;
                            }		
		int q = sc.nextInt();
        for(int i=0;i<q;i++){int b = sc.nextInt();
                             int c = sc.nextInt();
                             ans+=in[b-1]*(c-b);
                             in[c-1]+=in[b-1];
                             in[b-1]=0;
                             System.out.println(ans);
                            }		
	}
}