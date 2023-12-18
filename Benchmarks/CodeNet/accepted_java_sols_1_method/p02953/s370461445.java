import java.util.*;

public class Main{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int n=sc.nextInt();

      int[] h = new int[n];
    for(int i=0;i<n;i++){
      h[i]=sc.nextInt();
    }
    if(n==1){
      System.out.println("Yes");
    }
    else{
      for(int i=0;i<n-1;i++){
        if(h[i]-h[i+1]>=2){
          System.out.println("No");
          break;
        }
        else if(h[i]-h[i+1]==1){
          h[i+1]++;
        }
        if(i==n-2){
          System.out.println("Yes");
        }
      }
    }


    }
}
