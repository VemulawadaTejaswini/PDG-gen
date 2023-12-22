import java.util.*;

public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      	int N = sc.nextInt();
      	int s1[] = new int[N];
      	int s2[] = new int[N];
        
		int tmp1 = 0;
      	for(int i = 0; i < N; i++){
          int a1 = sc.nextInt();
          s1[i] = a1 + tmp1;
          //System.out.println(s1[i]);
          tmp1 += a1;
        }
      	int tmp2 = 0;
      	for(int i = 0; i < N; i++){
          int a2 = sc.nextInt();
          s2[i] = a2 + tmp2;
          tmp2 += a2;
        }
      int max = 0;
      if(N != 1){
      	max = s1[N - 1] + (s2[N - 1] - s2[N - 2]);
      }else {
      	max = s1[N - 1] + s2[N - 1];
      }
      //System.out.println(max);
      int total = 0;
      for(int i = 0; i < N; i++){
        if(i == 0){
          	total = s1[i] + s2[N - 1];
        }else{
        	total = s1[i] + (s2[N - 1] - s2[i - 1]);
        }
        if(max <= total){
        	max = total;
        }
        total = 0;
      }
      System.out.println(max);
    }
}