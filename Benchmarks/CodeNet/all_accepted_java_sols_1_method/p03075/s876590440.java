import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int e = sc.nextInt();
    int k = sc.nextInt();
    if(e-d>k||e-c>k||e-b>k||e-a>k||d-c>k||d-b>k||d-a>k||c-b>k||c-a>k||b-a>k){
      System.out.println(":(");
    }else{
      System.out.println("Yay!");
    }
 }
}