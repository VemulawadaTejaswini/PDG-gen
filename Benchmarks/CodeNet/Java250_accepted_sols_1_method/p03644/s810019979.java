import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   int n=sc.nextInt();
    int cnt=0;
    int max=-1;
    int val=0;
    for(int i=1; i<=n; i++){
      int element=i;
      boolean ok=true;
      while(ok){
        if(element%2==0){
          cnt++;
          element=element/2;
        }else{
          ok=false;
        }
      }
      if(max<cnt){
        max=cnt;
        val=i;
      }
      cnt=0;
    }
    System.out.println(val);
  }
}