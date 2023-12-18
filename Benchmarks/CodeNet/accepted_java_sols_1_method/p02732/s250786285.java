import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int[] A = new int[N];
      long sum = 0;
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
      for(int i=0;i<N;i++){
        A[i] = sc.nextInt();
        if(map.containsKey(A[i])){
          sum+=map.get(A[i]);
          map.put(A[i],map.get(A[i])+1);
        }else{
          map.put(A[i],1);
        }
      }
      for(int i=0;i<N;i++){
        System.out.println(sum-(map.get(A[i])-1));
      }
    }
}