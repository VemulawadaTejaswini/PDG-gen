import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a[] = new int[n];
    int data[] = new int[n];
    int x = 0;
    int y = 0;

    for(int i=0 ; i<n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i=0 ; i<n ; i++){
      if(a[i]%2==0){
        x++;
        if(a[i]%3==0 || a[i]%5==0){
          y++;
        }
      }
    }
    
    if(x==y){
      System.out.println("APPROVED");
    }else{
      System.out.println("DENIED");
    }
  }
}
