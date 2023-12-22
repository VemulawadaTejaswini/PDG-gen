import java.util.*;
 
public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[]L = new int[N];
    
      int all = 0;
      for(int i=0; i<N; i++){
		L[i]= sc.nextInt();
        all += L[i];	
}
    Arrays.sort(L);
    int hiku = 0;
    int a = N-K;
    for(int j=0; j<a; j++){
       hiku += L[j];
    }
    System.out.println(all-hiku);
    }
}