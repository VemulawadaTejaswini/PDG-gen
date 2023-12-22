import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt(),k=sc.nextInt();
    int val=1;
    for(int i=0;i<n;i++){
      if(val>k){
        val+=k;
      }else{
        val=2*val;
      }
    }
    System.out.println(val);
  }
}