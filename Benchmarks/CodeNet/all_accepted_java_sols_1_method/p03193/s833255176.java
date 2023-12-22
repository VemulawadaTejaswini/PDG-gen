import java.util.*;
class Main {
  public static void main (String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    
    int n=sc.nextInt();
    Long h=sc.nextLong();
    Long w=sc.nextLong();
    
    int ans =0;
    
    for(int i=0; i<n; i++){
      long hi = sc.nextLong();
      long wi = sc.nextLong();
      if(hi>=h){
        if(wi>=w){
          ans++;
          }
        }
      }
      
    System.out.println(ans);

  }
}