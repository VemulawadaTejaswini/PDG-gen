import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int[] x = new int[n];
      	int[] y = new int[n];
      	for(int i=0;i<n;i++){
          x[i] = sc.nextInt();
          y[i] = sc.nextInt();
        }
      	long ans = 0;
      	for(int i=0;i<n;i++){
          for(int j=i+1;j<n;j++){
            long a1 = x[i] - x[j];
            long a2 = y[i] - y[j];
            if( a1 < 0 ){
              a1 *= -1;
            }
            if( a2 < 0 ){
              a2 *= -1;
            }
            //System.out.println(ans+":"+a1+":"+a2);
            if( ans < a1 + a2 ){
              ans = a1 + a2;
            }
          }
        }
          System.out.println(ans);
	}
}