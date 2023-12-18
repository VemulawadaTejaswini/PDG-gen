import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int Nums[]=new int[N];
    int count=0;
    for(int i=0;i<N;i++){
      Nums[i]=sc.nextInt();
    }
  for(int i=2;i<N;i++){
    if(Nums[i-2]<Nums[i-1]&&Nums[i-1]<Nums[i]){
      count++;
   	 }else if(Nums[i-2]>Nums[i-1]&&Nums[i-1]>Nums[i]){
      count++;
    }
  	}System.out.println(count);
  }
}

