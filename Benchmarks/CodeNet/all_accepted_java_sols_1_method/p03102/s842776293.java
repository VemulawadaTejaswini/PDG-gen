import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
        int m = sc.nextInt(); 
        int c = sc.nextInt();
		int [] in = new int [m];
        int ans = 0;
        for(int i=0;i<m;i++){
                             in[i] = sc.nextInt();
                            }	
        for(int i=0;i<n;i++){int count = 0;
          for(int j=0;j<m;j++){int a = sc.nextInt();
                              count+=a*in[j];
                              if(j==m-1 && count+c>0){ans++;}}
                            }
	System.out.println(ans);
  }
}