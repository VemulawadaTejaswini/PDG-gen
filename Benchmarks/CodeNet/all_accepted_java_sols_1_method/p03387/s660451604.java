
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int x[] = new int[3];
     x[0] = sc.nextInt();
     x[1] = sc.nextInt();
     x[2] = sc.nextInt();

    int sum = x[0]+x[1]+x[2];
    int tag =0;
    Arrays.sort(x);
    int ans = 0;
    if((x[1]-x[0])%2!=0){
      tag=(x[2]+1)*3;
    }else{
      tag=x[2]*3;
    }
    System.out.println((tag-sum)/2);

  }
  

  
}
