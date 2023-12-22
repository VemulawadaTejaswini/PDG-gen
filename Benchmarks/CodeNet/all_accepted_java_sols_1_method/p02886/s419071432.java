import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
    long sum=0;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        sum=sum+arr[i]*arr[j];
      }
    }
    System.out.println(sum);
  }
}
