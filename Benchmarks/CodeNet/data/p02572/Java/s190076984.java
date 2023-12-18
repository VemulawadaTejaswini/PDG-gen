import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int mod = (int)Math.pow(10, 9)+7;
    long[] arr = new long[n];
    for(int i=0;i<n;i++){
      arr[i] = scan.nextInt();
    }
    long sum = 0;
    for(int i=0;i<n-1;i++){
      for(int j=i+1;j<n;j++){
        sum += (arr[i]*arr[j])%mod;
      }
    }
    System.out.println(sum%mod);

  }
}