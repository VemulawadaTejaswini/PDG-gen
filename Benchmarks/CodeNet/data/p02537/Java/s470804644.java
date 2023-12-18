import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
		int [] in = new int [n];  
        for(int i=0;i<n;i++){
                             in[i] = sc.nextInt();
                            }
        int ans = 1;
		for(int j=0;j<n;j++){
        int ans1 = 1;
        int point = j;
        while(point<n){for(int i=point+1;i<n;i++)
        {if(Math.abs(in[i]-in[point])<=k){ans1++;point=i;break;}                                                
         else{if(i==n-1){point=n;break;}                                                     
             }                                                                                                   
        } if(point==n-1){point=n;}
                      } 
        ans = Math.max(ans,ans1);
        }
		System.out.println(ans);
	}
}