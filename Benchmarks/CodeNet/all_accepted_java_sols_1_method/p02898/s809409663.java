import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int[] height = new int[n];
    int num = 0;
    for(int i = 0; i < n; i++){
      int t = sc.nextInt();
      if(t>=k){
        num++;
      }
    }
    System.out.println(num);
  }
}