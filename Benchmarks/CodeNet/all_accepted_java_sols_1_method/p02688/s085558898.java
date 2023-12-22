import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		
        int k = sc.nextInt();
        int ans = n;
        int [] in = new int [n];
        for(int i=0;i<k;i++){int a = sc.nextInt();
                             for(int j=0;j<a;j++){int b = sc.nextInt();
                                                 if(in[b-1]==0){in[b-1]++;}
                                                 }
                            }
        for(int i=0;i<n;i++){ans-=in[i];
                            }
		System.out.println(ans);
	}
}
