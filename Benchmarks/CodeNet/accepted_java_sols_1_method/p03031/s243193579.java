import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int m = sc.nextInt();
		int [][] in = new int [m][n+1]; 
        int [] p = new int [m];
        int [] light = new int [n];
        int ans = 0;
        for(int i=0;i<m;i++){in[i][0] = sc.nextInt();
                             for(int j=1;j<=in[i][0];j++)
                             {in[i][j] = sc.nextInt();}
                            }
        for(int i=0;i<m;i++){p[i]=sc.nextInt();}      
        for(int i=0;i<Math.pow(2,n);i++){int count = 0;int b = i;for(int j=0;j<n;j++){light[j]=b%2;
                                                                       b/=2;}
                                         for(int j=0;j<m;j++){int count2 = 0;
                                           for(int k=1;k<=in[j][0];k++){if(light[in[j][k]-1]==1){count2++;}
                                                                       }
                                                             if(count2%2==p[j]){count++;}
                                                             }
                                        if(count==m){ans++;}}                        
		System.out.println(ans);
	}
}