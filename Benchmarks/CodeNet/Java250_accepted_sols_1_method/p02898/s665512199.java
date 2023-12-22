import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int Nums[]=new int[A];
    int count=0;
    for(int i=0;i<A;i++){
    	Nums[i]=sc.nextInt();
    }
     for(int i=0;i<A;i++){
    	if(Nums[i]>=B){
        	count++;
        }
    }
    System.out.print(count);
  }
}