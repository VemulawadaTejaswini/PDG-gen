import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
		long [] a = new long [n];
        for(int i=0;i<n;i++){
                             a[i] = sc.nextLong();
                            } 
           
        while(m>0){Arrays.sort(a); long max = a[n-1]; if(max==0){break;}
                  for(int i=n-1;i>=0;i--){if(a[i]>max/2){a[i]/=2;m--;if(m==0){break;}
                                                        }else{break;}
                                         } 
                  }
        long ans = 0;
        for(int i=0;i<n;i++){ans+=a[i];
                            }      
		System.out.println(ans);
	}
}
