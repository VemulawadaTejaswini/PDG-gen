import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int aa[] = new int[n];
    for(int i = 0;i<n;i++){
      aa[i] = sc.nextInt();
    }
    Arrays.sort(aa);
    int a = 0;
    int b = 0;
    int count = 0;
    for(int i = n-1;i>=0;i--){
      if(count % 2 == 0){
        a += aa[i];
      }else{
        b += aa[i];
      }
      count++;
    }
    System.out.println(a-b);
  }
}
