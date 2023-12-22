import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int m = sc.nextInt();
        int ans = n;
        int [] in = new int [n];
        int [] in2 = new int [n];
        for(int i=0;i<n;i++){in[i] = sc.nextInt();                             
                            }      
        for(int i=0;i<m;i++){int a = sc.nextInt();
                             int b = sc.nextInt();
                             if(in[a-1]>in[b-1]){in2[b-1]=1;
                                    }else{if(in[a-1]<in[b-1]){in2[a-1]=1;}
                                         else{in2[a-1]=1;
                                             in2[b-1]=1;}
                                         }
                            }
        for(int i=0;i<n;i++){ans-=in2[i];}
		System.out.println(ans);
	}
}
