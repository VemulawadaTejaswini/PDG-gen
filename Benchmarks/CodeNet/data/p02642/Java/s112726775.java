import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] p = new int[n];
      	boolean flag = false;
      	boolean rflag = false;
     	long ans = 0;
		for(int i=0;i<n;i++){
          p[i] = sc.nextInt();
        }
      	for(int i=1;i<=n;i++){
          flag = true;
          rflag = true;
          for(int j=i+1;j<=n;j++){
            if( p[i-1] % p[j-1] == 0 ){
              flag = false;
            }
            if( p[j-1] % p[i-1] == 0 ){
              rflag = false;
            }
            if( !flag && !rflag ){
              break;
            }
          }
          if( flag ){
            ans++;
          }
          if( rflag ){
            ans++;
          }
        }	
      System.out.println(ans);
	}
}