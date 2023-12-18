import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    int cnt = 0;
    int[] array = new int[n];
    for(int i=0;i<n;i++){
      array[i] = sc.nextInt();
    }
    for(int i=0;i<n;i++){
      if(array[i]>=k){
        cnt++;
      }
    }
    System.out.println(cnt);
  }
}
