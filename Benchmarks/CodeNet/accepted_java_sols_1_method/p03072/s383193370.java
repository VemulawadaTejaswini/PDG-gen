import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
		int [] in = new int [n];
        int ans = 1;       
        for(int i=0;i<n;i++){
                             in[i] = sc.nextInt();
                            }	 
        int max = in[0];
        for(int i=1;i<n;i++){if(max<=in[i]){ans++;max=in[i];}                             
                            }	
        System.out.println(ans);
  }
}