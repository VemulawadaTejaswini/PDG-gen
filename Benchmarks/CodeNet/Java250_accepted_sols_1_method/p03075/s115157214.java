import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      int d = sc.nextInt();
      int e = sc.nextInt();
      int k = sc.nextInt();
      int[] S = new int[]{a,b,c,d,e};
      
      int max = S[0];
      int min = S[0];
      for (int i = 0; i < S.length; i++) {
        int v = S[i];
        if(v > max){
          max = v;
        }if(v < min){
          min = v;
        }
      }
      
      if(max-min <= k){
        System.out.println("Yay!");
      }else{
        System.out.println(":(");
      }
    }
}