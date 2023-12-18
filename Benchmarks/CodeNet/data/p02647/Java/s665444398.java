import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int k = sc.nextInt();
        k = Math.min(k,41);     
        int [] in = new int [n];
        int [] in2 = new int [n];
        for(int i=0;i<n;i++){
                             in[i] = sc.nextInt();
                            }
        for(int j=0;j<k;j++){
        for(int i=0;i<n;i++){in2[i]=0;}
        for(int i=0;i<n;i++){int l = Math.max(0,i-in[i]);  
                             int r = Math.min(n-1,i+in[i]);  
                             in2[l]++; 
                             if(r+1<n) in2[r+1]--;                             
                            }       
        for(int i=1;i<n;i++){in2[i]+=in2[i-1];}
        for(int i=0;i<n;i++){in[i]=in2[i];}
        }
		for(int i=0;i<n;i++){System.out.println(in[i]);
                            }
	}
}
