import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a1 = new int[N];
        int[] a2 = new int[N];
        for(int i=0; i<N; i++){
          a1[i] = sc.nextInt();
        }
        for(int i=0; i<N; i++){
          a2[i] = sc.nextInt();
        }
        int max = 0;
        int total = 0;
        for(int i=0; i<N; i++){
          for(int z=0; z<=i; z++) total += a1[z];
          for(int j=i; j<N; j++) total += a2[j];
          if(max < total) max = total;
          total = 0;
        }
        System.out.print(max);
        
}
}
