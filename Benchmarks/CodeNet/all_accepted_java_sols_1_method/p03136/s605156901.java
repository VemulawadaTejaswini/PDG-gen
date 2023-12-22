import java.util.*;
 
class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		for (int i=0;i<N;i++){
			p[i]=sc.nextInt();
		}
		Arrays.sort(p);
      int x = 0;
      int w = p[N-1];
      for(int i =0;i<N-1;i++){
        x = x + p[i];
      }
      	if(w<x){
          System.out.print("Yes");
        }else{
          System.out.print("No");
        }

	}
}