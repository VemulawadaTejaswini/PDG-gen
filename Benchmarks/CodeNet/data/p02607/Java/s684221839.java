import java.util.*;



public class b {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int a[] = new int[n];
    for(int i =0; i<n; i++){
      a[i] = scanner.nextInt();
    }

    int ans  =0;
    for(int i = 1; i < n; i+= 2){
      if( a[i] % 2 == 1){
        ans++;
      }
    }
    


    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
