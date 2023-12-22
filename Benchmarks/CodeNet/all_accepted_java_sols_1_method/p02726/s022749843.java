
import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    
    int[] ans =new int[n];
    
    for(int i=1; i<n+1; i++){
        for(int j=i+1; j<n+1; j++){
          int tmp =Math.min(Math.min(j-i, Math.abs(x-i)+1+Math.abs(y-j)),Math.abs(y-i)+1+Math.abs(x-j));
          ans[tmp-1]++;
          

        }
      }
for(int i=0; i<n-1; i++){
    System.out.println(ans[i]);
}
  }
}
