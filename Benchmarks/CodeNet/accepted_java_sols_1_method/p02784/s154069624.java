import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int h = sc.nextInt();
    int n = sc.nextInt();
    int data[] = new int[n];
    int sum = 0;

    for (int i = 0;i<n ;i++ ) {
      data[i] = sc.nextInt();
      sum +=data[i];
    }

    if (sum>=h) {
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }



  }
}
