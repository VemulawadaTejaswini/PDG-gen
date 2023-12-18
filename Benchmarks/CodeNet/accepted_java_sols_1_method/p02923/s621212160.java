import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    int ans = 0;
    int max = 0;
    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }
    for(int i = 0; i < n-1; i++){
      if(arr[i] >= arr[i+1]){
        ans++;
        if(max < ans){max = ans;}
      }else{
        ans = 0;
      }
    }
    System.out.println(max);
  }
}