import java.util.*;
import java.util.stream.Collectors;
public class Main {
	public static void main(String[] args){
	   Scanner sc = new Scanner(System.in);
	  int N = sc.nextInt();
      int K = sc.nextInt();
      //System.out.println(N);
      //System.out.print( K);
      
      Integer[] P = new Integer[N];
      for(int i=0;i<N;i++){
      	P[i]= sc.nextInt();
       // System.out.print(P[i]+" ");
      }    
     	
      List<Integer> PList = Arrays.asList(P);
      
     PList = PList.stream()
       .sorted((p1, p2) -> p1.compareTo(p2))
       .collect(Collectors.toList());
      
       Integer sum = 0;
  for(int j=0;j<K;j++){
   sum += PList.get(j);
  }
  
  System.out.println(sum);
   }
}