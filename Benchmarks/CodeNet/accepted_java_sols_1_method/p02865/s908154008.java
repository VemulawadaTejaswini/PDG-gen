import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int ans = 0;
    int nh = 0;
    
    if(n%2==0){
      nh = n/2;
    } else {
      nh = (n+1)/2;
    }
    
    for(int i=1; i<nh; i++){
      if(n-i!=i){
        ans++;
      }
    }

    System.out.println(ans);
    
  }
}
