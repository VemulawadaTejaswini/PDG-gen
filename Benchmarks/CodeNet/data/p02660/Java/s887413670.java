import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long ans = 0;
        int p = 2;
        double k = Math.sqrt(n);
        while(n>=2){for(int i=p;i<=k;i++){if(n%i==0){n/=i;p=i+1;ans++;break;}
                                                     else{if(i+1>k){ans++;n=1;break;}
                                                         }
                                         } k = Math.sqrt(n);if(n>1 && p>k){ans++;break;}
                   }
		System.out.println(ans);
	}
}