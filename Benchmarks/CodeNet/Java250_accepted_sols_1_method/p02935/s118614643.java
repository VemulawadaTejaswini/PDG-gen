import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		
		double[] V = new double[N];
  		
		double ave = 0;
		int max = 0;
	    int max2 = 0;
		for(int i = 0 ;i<N;i++){
			V[i] = sc.nextInt();
        }
      
      	Arrays.sort(V);
      
      	for(int i = 1 ;i<N;i++){
			if(ave == 0){
              ave = (V[0] + V[1]) / 2;
            }else{
              ave = (ave + V[i]) /2;
            }
        }
 	  
      
		System.out.println(ave);
	}
}