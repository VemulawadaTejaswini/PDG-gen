import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	int[] p = new int[n];
     	long ans = 0;
		for(int i=0;i<n;i++){
          p[i] = sc.nextInt();
        }
      	Arrays.sort(p);
      
      	boolean flag;
        for(int i=1;i<=n;i++){
          flag = true;
            for(int j=i+1;j<i+2&&j<=n;j++){
              if( p[i-1] % p[j-1] == 0 ){
                flag = false;
                break;
              }      
            }
          if( flag ){
            ans++;
          }
        }
        System.out.println(ans);
	}
}