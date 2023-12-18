import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int T = sc.nextInt();
      	int A = sc.nextInt();
      	double[] H = new double[N];
      	for(int i=0;i<N;i++){
        	H[i] = sc.nextInt();
          	H[i] = T- H[i]*0.006;
          	H[i] = Math.abs(H[i]-A);
        }
      	double min = H[0];
      	int num = 0;
      	for(int i=0;i<N;i++){
        	if(min > H[i]){
              min = H[i];
              num = i;
            }
        }
      	System.out.println(num+1);
    }
}