import java.util.Scanner;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    double[] v = new double[N];
    int i = 0;
    int ptr = 1;
    int avgs = 0;

    for(i = 0; i < N; i++){
    	v[i] = sc.nextInt();
    }
    Arrays.sort(v);

    if(N == 2){
    	System.out.println((v[0] + v[1]) / 2);
    }else{
	    for(i = 2; i < N; i++){
	    	v[0] = (v[0] + v[1]) / 2;
	    	v[1] = v[i];
	    }
	    System.out.println((v[0] + v[1]) / 2);
	}
  }
}