import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    arr[0] = sc.nextInt();
    arr[1] = sc.nextInt();
    arr[2] = sc.nextInt();
    arr[3] = sc.nextInt();
    arr[4] = sc.nextInt();
    Arrays.sort(arr);
    System.out.print(arr[4]); 
    System.out.print(" ");
    System.out.print(arr[3]); 
    System.out.print(" ");
    System.out.print(arr[2]); 
    System.out.print(" ");
    System.out.print(arr[1]); 
    System.out.print(" ");
    System.out.println(arr[0]); 
  }
}