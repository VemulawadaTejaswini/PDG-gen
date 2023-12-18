import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = Integer.parseInt(sc.next());
  int k = Integer.parseInt(sc.next());
  if (k>=n){
  System.out.println(0);
  }
  int[] m = new int[n];
  long turn = 0;
  if(k<n){
      for (int i = 0; i < n; i++){
  	m[i] = Integer.parseInt(sc.next());
  }
    Arrays.sort(m);
   
    for (int i = 0; i<n-k; i++){
        	turn += m[i];
    }
    System.out.println(turn);
  }
}
}