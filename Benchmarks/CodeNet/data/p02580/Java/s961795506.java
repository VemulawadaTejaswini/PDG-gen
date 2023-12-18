import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	int H = sc.nextInt();
      	int W = sc.nextInt();
      	int M = sc.nextInt();
      	int[] h = new int[M];
      	int[] w = new int[M];
      	int[] H1 = new int[H+1];
      	int[] W1 = new int[W+1];
      	int maxH = 0;
      	int maxW = 0;
      	boolean flag = false;
      	for(int i=0;i<M;i++){
          h[i] = sc.nextInt();
          w[i] = sc.nextInt();
          H1[h[i]]++;
          W1[w[i]]++;
          if( ( H1[h[i]] >= maxH )&&( W1[w[i]] >= maxW ) ){
            flag = true;
            maxH = H1[h[i]];
            maxW  =W1[w[i]];
          }else if( H1[h[i]] >= maxH ){
            flag = false;
            maxH = H1[h[i]];
          }else if( H1[h[i]] >= maxW ){
            flag = false;
            maxW = W1[w[i]];
          }
        }
      	Arrays.sort(H1);
      	Arrays.sort(W1);
      	long ans = H1[H1.length-1]+W1[W1.length-1];
      	if( !flag ){
          ans -= 1;
        }
      	System.out.println(ans);	
	}
}