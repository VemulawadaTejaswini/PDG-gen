import java.util.*;

public class Main {
	public static void main(String[] args) {
      Scanner sc =new Scanner(System.in);
      int N = sc.nextInt();
      int[] p = new int[N];
      int max =0,total =0,chance =1;
      for (int i=0; i<N; i++) {
        p[i] = sc.nextInt();
        max = Math.max(p[i],max);
      }
      for (int i=0; i<N; i++) {
        if(p[i] == max && chance != 0) {
          p[i] /= 2;
          chance--;
        }
        total += p[i];
      }
      System.out.println(total); 
    }
}