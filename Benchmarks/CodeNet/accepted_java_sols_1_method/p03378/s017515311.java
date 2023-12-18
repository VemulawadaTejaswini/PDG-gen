import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int X = sc.nextInt();
   	int count=0;
    int j=0;
    int Nums[]=new int[M];
    for(int i=0;i<M;i++){
    	Nums[i]=sc.nextInt();
    }

    if(X<N/2){
    for(int i=M-1;i>=0;i--){
    	if(Nums[i]<X){
          count++;
   		 }
      }
    }else{
      for(int i=0;i<M;i++){
    	if(Nums[i]>X){
          count++;
   		 }
    }
    }
    System.out.println(count);
  }
}
