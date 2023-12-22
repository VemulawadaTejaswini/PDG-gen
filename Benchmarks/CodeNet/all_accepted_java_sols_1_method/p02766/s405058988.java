import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    
    int ans = 0;
    
    for(int i=0; i<50000; i++){
      if(n > 0){
        n /= k;
        ans++;
      }else if(n == 0){
        break;
      }else{}
    }
    
    System.out.println(ans);
    
  }
}
