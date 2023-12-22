import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int c = sc.nextInt();
    int count = 0;
    int[] array_b = new int[m];
    for(int i = 0; i < m; i++){
      array_b[i] = sc.nextInt();
    }
    for(int i = 0; i < n; i++){
      int[] array_a = new int[m];
      int ans = 0;
      for(int j = 0; j < m;j++){
        //array_a[i] = sc.nextInt();
        int temp = sc.nextInt();
        ans += array_b[j]*temp;
      }
      ans+=c;
      if(ans>0){
        count++;
      }
    }
    System.out.println(count);
  }
}