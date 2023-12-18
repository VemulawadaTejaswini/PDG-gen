import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int n = sc.nextInt();
	  int[] b = new int[n-1];
	  
	  for(int i=0;i<n-1;i++)b[i]=sc.nextInt();
	  int ans = b[0];
	  for(int i = 1;i<n-1;i++){
	  	if(b[i-1]<b[i]){
          ans+=b[i-1];
        }else ans+=b[i];
	  }

	  ans += b[n-2];
	  
	  System.out.println(ans);
	}
}