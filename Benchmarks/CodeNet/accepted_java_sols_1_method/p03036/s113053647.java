import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int x1 = sc.nextInt();
    int x2=  sc.nextInt();
    int Nums[]=new int[10];
    for(int i=0;i<10;i++){
      	if(i==0){
    	Nums[i]=r*x2-x1;
        }else{
          Nums[i]=r*Nums[i-1]-x1;
        }
    }
    for(int i=0;i<10;i++){
    System.out.println(Nums[i]);
    }
  }
}
