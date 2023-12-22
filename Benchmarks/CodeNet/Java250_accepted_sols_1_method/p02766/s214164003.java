import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextInt();
    int k = sc.nextInt();
    long a = 0;
    int count = 0;
    for(int i=0 ; i<n ; i++){
      a = (long)Math.pow(k,i);
      if(n/a>0){
        count++;
      }else{
        count++;
        break;
      }
    }
    if(count==1){
      System.out.println(count);
    }else{
      System.out.println(count-1);
    }

  }
}
