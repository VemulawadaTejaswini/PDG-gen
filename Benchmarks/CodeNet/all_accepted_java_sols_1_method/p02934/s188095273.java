import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      
	    double[] A = new double[N];
	    double[] gA = new double[N];
	    double num = 0;
    
  	    for(int i = 0 ;i<N;i++){
          A[i] = sc.nextInt();
          gA[i] = 1/A[i];
          num = num + gA[i];
       	}
      
      	num = 1/num;
		System.out.println(num);
	}
}