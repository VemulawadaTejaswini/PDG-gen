import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = sc.nextInt();
    int n = sc.nextInt();
    int[] arr = new int[n];
    int sum = 0; boolean flag = true;
    for(int i=0;i<n;i++) {
      arr[i]=sc.nextInt();
      sum = sum + arr[i];
    }
    String ans = (sum>=h) ? "Yes" : "No";
    System.out.println(ans);


    }
  }
