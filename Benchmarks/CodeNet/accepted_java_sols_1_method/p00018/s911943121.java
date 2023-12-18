import java.util.Scanner;
import java.util.Arrays;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int arr[] = {a,b,c,d,e};
    Arrays.sort(arr);
    for (int i = 0; i < 4; i++) {
      System.out.print(arr[4-i] + " ");
    }
    System.out.println(arr[0]);
  }
  
}