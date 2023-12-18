import java.util.*;
public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		long N=sc.nextInt();
      	long ans=0;
      	long all=1;
      	long minas=1;
      	long plus=1;
      	long mod=1000000007;
      	for(int i=0;i<N;i++){
          all=all*10%mod;
          minas=minas*9%mod;
          plus=plus*8%mod;
        }
		ans=all-minas*2+plus;
      	ans=(ans+mod)%mod;
		System.out.println((all-minas*2+plus)%mod);
	}
}

