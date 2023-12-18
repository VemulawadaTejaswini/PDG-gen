import java.util.Scanner;
 
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextLong();
    long[] arr = new long[n-1];
    for(int i=0; i < n; i++){
      arr[i] = scan.nextLong();
    }
    long min = arr[0]; long max = arr[0]; long sum=0;
    for(int j=0; j < n; j++){
      if(arr[j] > max){max = arr[j];}
      if(arr[j] < min){min = arr[j];}
       sum = sum + arr[j];
    }
    System.out.println(min +" "+ max +" "+ sum);
  }
}