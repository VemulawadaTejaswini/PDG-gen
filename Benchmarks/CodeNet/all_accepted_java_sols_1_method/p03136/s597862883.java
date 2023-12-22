import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
        int L[] = new int[N];
        int max = 0;
        int total = 0;
      for(int i=0;i<N;i++){
        L[i] = sc.nextInt();
        if(L[i] > max){
          max = L[i];
        }
        total += L[i];
      }
      
      if(max < total - max){
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }      
	}
}