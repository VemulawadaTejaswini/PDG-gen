import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] h = new int[n];
    int str = 0;
    int max = 0;
    for(int i = 0; i < n; i++){
      h[i] = sc.nextInt();
      if(i != 0 && h[i] <= h[i - 1]){
        str++;
        if(i == n - 1){
          max = Math.max(max , str);
        }
      }else if(i != 0 && h[i] > h[i - 1] && str != 0){
        max = Math.max(max , str);
        str = 0;
      }
    }
    System.out.println(max);
  }
}