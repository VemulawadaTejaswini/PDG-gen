import java.util.*;
public class Main {
    public static void main(String[] args){

	  Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int K = sc.nextInt();
      int p[] = new int[N];

      for(int i=0;i<N;i++){
        p[i] = sc.nextInt();
      }
      Arrays.sort(p);
      int total = 0;
      for(int j=0;j<K;j++){
      	total = total + p[j];
      }
      System.out.println(total);

    }
}