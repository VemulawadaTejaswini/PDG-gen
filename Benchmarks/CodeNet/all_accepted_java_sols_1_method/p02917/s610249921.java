import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] b = new int[n-1];
    int result = 0;

    for(int i=0; i<n-1; i++){
      b[i] = sc.nextInt();
    }
    for(int i=0; i<n; i++){
      if(i==0){
        result += b[0];
      }else if(i>0 && i<n-1){
        result += (b[i]<b[i-1])?b[i]:b[i-1];
      }else{
        result += b[n-2];
      }
    }
    System.out.println(result);

  }
}