import java.util.*;
public class Main {
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
  	int N = sc.nextInt();
  	int[] x = new int[N];
	for (int i=0;i<N;i++){
		x[i] = sc.nextInt();
	}
  	Arrays.sort(x);
  	int tairyoku = 0;
  	int min = Integer.MAX_VALUE;
  	for (int p=x[0];p<=x[N-1];p++){
      tairyoku = 0;
      for(int j=0;j<N;j++){
        tairyoku = tairyoku + (x[j]-p)*(x[j]-p);
      }
      if(min > tairyoku){
        min = tairyoku;
      }
      //System.out.println("p:"+p+",tairyoku:"+tairyoku);
    }

	System.out.println(min);
}
}